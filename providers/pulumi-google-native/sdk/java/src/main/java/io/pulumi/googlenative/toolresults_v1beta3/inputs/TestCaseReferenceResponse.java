// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.toolresults_v1beta3.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * A reference to a test case. Test case references are canonically ordered lexicographically by these three factors: * First, by test_suite_name. * Second, by class_name. * Third, by name.
 * 
 */
public final class TestCaseReferenceResponse extends io.pulumi.resources.InvokeArgs {

    public static final TestCaseReferenceResponse Empty = new TestCaseReferenceResponse();

    /**
     * The name of the class.
     * 
     */
    @Import(name="className", required=true)
      private final String className;

    public String getClassName() {
        return this.className;
    }

    /**
     * The name of the test case. Required.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * The name of the test suite to which this test case belongs.
     * 
     */
    @Import(name="testSuiteName", required=true)
      private final String testSuiteName;

    public String getTestSuiteName() {
        return this.testSuiteName;
    }

    public TestCaseReferenceResponse(
        String className,
        String name,
        String testSuiteName) {
        this.className = Objects.requireNonNull(className, "expected parameter 'className' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.testSuiteName = Objects.requireNonNull(testSuiteName, "expected parameter 'testSuiteName' to be non-null");
    }

    private TestCaseReferenceResponse() {
        this.className = null;
        this.name = null;
        this.testSuiteName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TestCaseReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String className;
        private String name;
        private String testSuiteName;

        public Builder() {
    	      // Empty
        }

        public Builder(TestCaseReferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.className = defaults.className;
    	      this.name = defaults.name;
    	      this.testSuiteName = defaults.testSuiteName;
        }

        public Builder className(String className) {
            this.className = Objects.requireNonNull(className);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder testSuiteName(String testSuiteName) {
            this.testSuiteName = Objects.requireNonNull(testSuiteName);
            return this;
        }
        public TestCaseReferenceResponse build() {
            return new TestCaseReferenceResponse(className, name, testSuiteName);
        }
    }
}
