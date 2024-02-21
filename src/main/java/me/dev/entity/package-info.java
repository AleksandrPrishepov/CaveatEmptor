
@org.hibernate.annotations.GenericGenerator(
        name = "custom",
        strategy = "enhanced-sequence",
        parameters = {
        @org.hibernate.annotations.Parameter(
                name = "sequence_name",
                value = "JPWH_SEQUENCE"
        ),
        @org.hibernate.annotations.Parameter(
                name = "initial_value",
                value = "1000"
        )
})


package me.dev.entity;
