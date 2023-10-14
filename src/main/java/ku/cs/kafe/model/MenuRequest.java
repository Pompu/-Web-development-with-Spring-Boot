// Pecthgamon Sangnual 6410406819
package ku.cs.kafe.model;


import lombok.Data;

import java.util.UUID;


@Data
public class MenuRequest {
    private String name;
    private double price;
    private UUID categoryId;
}

