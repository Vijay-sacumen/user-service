package com.sacumen.microservices.user.VO;

import com.sacumen.microservices.user.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.engine.jdbc.connections.internal.UserSuppliedConnectionProviderImpl;

/**
 * @author Kumar Vijay
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {
    private Department department;
    private User user;
}
