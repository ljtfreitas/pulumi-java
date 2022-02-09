// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.toolresults_v1beta3.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.toolresults_v1beta3.inputs.AnyResponse;
import java.lang.String;
import java.util.Objects;


public final class TestIssueResponse extends io.pulumi.resources.InvokeArgs {

    public static final TestIssueResponse Empty = new TestIssueResponse();

    @InputImport(name="category", required=true)
    private final String category;

    public String getCategory() {
        return this.category;
    }

    @InputImport(name="errorMessage", required=true)
    private final String errorMessage;

    public String getErrorMessage() {
        return this.errorMessage;
    }

    @InputImport(name="severity", required=true)
    private final String severity;

    public String getSeverity() {
        return this.severity;
    }

    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    @InputImport(name="warning", required=true)
    private final AnyResponse warning;

    public AnyResponse getWarning() {
        return this.warning;
    }

    public TestIssueResponse(
        String category,
        String errorMessage,
        String severity,
        String type,
        AnyResponse warning) {
        this.category = Objects.requireNonNull(category, "expected parameter 'category' to be non-null");
        this.errorMessage = Objects.requireNonNull(errorMessage, "expected parameter 'errorMessage' to be non-null");
        this.severity = Objects.requireNonNull(severity, "expected parameter 'severity' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.warning = Objects.requireNonNull(warning, "expected parameter 'warning' to be non-null");
    }

    private TestIssueResponse() {
        this.category = null;
        this.errorMessage = null;
        this.severity = null;
        this.type = null;
        this.warning = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TestIssueResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String category;
        private String errorMessage;
        private String severity;
        private String type;
        private AnyResponse warning;

        public Builder() {
    	      // Empty
        }

        public Builder(TestIssueResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.category = defaults.category;
    	      this.errorMessage = defaults.errorMessage;
    	      this.severity = defaults.severity;
    	      this.type = defaults.type;
    	      this.warning = defaults.warning;
        }

        public Builder setCategory(String category) {
            this.category = Objects.requireNonNull(category);
            return this;
        }

        public Builder setErrorMessage(String errorMessage) {
            this.errorMessage = Objects.requireNonNull(errorMessage);
            return this;
        }

        public Builder setSeverity(String severity) {
            this.severity = Objects.requireNonNull(severity);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setWarning(AnyResponse warning) {
            this.warning = Objects.requireNonNull(warning);
            return this;
        }

        public TestIssueResponse build() {
            return new TestIssueResponse(category, errorMessage, severity, type, warning);
        }
    }
}