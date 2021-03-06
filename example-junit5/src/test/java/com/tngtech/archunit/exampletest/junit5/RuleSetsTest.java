package com.tngtech.archunit.exampletest.junit5;

import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchRules;
import com.tngtech.archunit.junit.ArchTest;

@AnalyzeClasses(packages = "com.tngtech.archunit.example")
class RuleSetsTest {
    @ArchTest
    private final ArchRules CODING_RULES = ArchRules.in(CodingRulesTest.class);

    @ArchTest
    private final ArchRules CYCLIC_DEPENDENCY_RULES = ArchRules.in(CyclicDependencyRulesTest.class);
}
