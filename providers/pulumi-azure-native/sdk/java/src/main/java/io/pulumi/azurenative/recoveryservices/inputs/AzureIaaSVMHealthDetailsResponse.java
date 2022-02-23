// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Azure IaaS VM workload-specific Health Details.
 * 
 */
public final class AzureIaaSVMHealthDetailsResponse extends io.pulumi.resources.InvokeArgs {

    public static final AzureIaaSVMHealthDetailsResponse Empty = new AzureIaaSVMHealthDetailsResponse();

    /**
     * Health Code
     * 
     */
    @InputImport(name="code", required=true)
        private final Integer code;

    public Integer getCode() {
        return this.code;
    }

    /**
     * Health Message
     * 
     */
    @InputImport(name="message", required=true)
        private final String message;

    public String getMessage() {
        return this.message;
    }

    /**
     * Health Recommended Actions
     * 
     */
    @InputImport(name="recommendations", required=true)
        private final List<String> recommendations;

    public List<String> getRecommendations() {
        return this.recommendations;
    }

    /**
     * Health Title
     * 
     */
    @InputImport(name="title", required=true)
        private final String title;

    public String getTitle() {
        return this.title;
    }

    public AzureIaaSVMHealthDetailsResponse(
        Integer code,
        String message,
        List<String> recommendations,
        String title) {
        this.code = Objects.requireNonNull(code, "expected parameter 'code' to be non-null");
        this.message = Objects.requireNonNull(message, "expected parameter 'message' to be non-null");
        this.recommendations = Objects.requireNonNull(recommendations, "expected parameter 'recommendations' to be non-null");
        this.title = Objects.requireNonNull(title, "expected parameter 'title' to be non-null");
    }

    private AzureIaaSVMHealthDetailsResponse() {
        this.code = null;
        this.message = null;
        this.recommendations = List.of();
        this.title = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureIaaSVMHealthDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer code;
        private String message;
        private List<String> recommendations;
        private String title;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureIaaSVMHealthDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.message = defaults.message;
    	      this.recommendations = defaults.recommendations;
    	      this.title = defaults.title;
        }

        public Builder setCode(Integer code) {
            this.code = Objects.requireNonNull(code);
            return this;
        }

        public Builder setMessage(String message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }

        public Builder setRecommendations(List<String> recommendations) {
            this.recommendations = Objects.requireNonNull(recommendations);
            return this;
        }

        public Builder setTitle(String title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }
        public AzureIaaSVMHealthDetailsResponse build() {
            return new AzureIaaSVMHealthDetailsResponse(code, message, recommendations, title);
        }
    }
}
