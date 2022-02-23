// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.toolresults_v1beta3.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A reference to a test case. Test case references are canonically ordered lexicographically by these three factors: * First, by test_suite_name. * Second, by class_name. * Third, by name.
 * 
 */
public final class TestCaseReferenceArgs extends io.pulumi.resources.ResourceArgs {

    public static final TestCaseReferenceArgs Empty = new TestCaseReferenceArgs();

    /**
     * The name of the class.
     * 
     */
    @InputImport(name="className")
      private final @Nullable Input<String> className;

    public Input<String> getClassName() {
        return this.className == null ? Input.empty() : this.className;
    }

    /**
     * The name of the test case. Required.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The name of the test suite to which this test case belongs.
     * 
     */
    @InputImport(name="testSuiteName")
      private final @Nullable Input<String> testSuiteName;

    public Input<String> getTestSuiteName() {
        return this.testSuiteName == null ? Input.empty() : this.testSuiteName;
    }

    public TestCaseReferenceArgs(
        @Nullable Input<String> className,
        @Nullable Input<String> name,
        @Nullable Input<String> testSuiteName) {
        this.className = className;
        this.name = name;
        this.testSuiteName = testSuiteName;
    }

    private TestCaseReferenceArgs() {
        this.className = Input.empty();
        this.name = Input.empty();
        this.testSuiteName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TestCaseReferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> className;
        private @Nullable Input<String> name;
        private @Nullable Input<String> testSuiteName;

        public Builder() {
    	      // Empty
        }

        public Builder(TestCaseReferenceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.className = defaults.className;
    	      this.name = defaults.name;
    	      this.testSuiteName = defaults.testSuiteName;
        }

        public Builder setClassName(@Nullable Input<String> className) {
            this.className = className;
            return this;
        }

        public Builder setClassName(@Nullable String className) {
            this.className = Input.ofNullable(className);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setTestSuiteName(@Nullable Input<String> testSuiteName) {
            this.testSuiteName = testSuiteName;
            return this;
        }

        public Builder setTestSuiteName(@Nullable String testSuiteName) {
            this.testSuiteName = Input.ofNullable(testSuiteName);
            return this;
        }
        public TestCaseReferenceArgs build() {
            return new TestCaseReferenceArgs(className, name, testSuiteName);
        }
    }
}
