package com.devmam.admin.catalago.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.devmam.admin.catalago.domain.Category;

public class CategoryTest {

    @Test
    public void testNewCategory() {
        Assertions.assertNotNull(new Category());
    }
}
