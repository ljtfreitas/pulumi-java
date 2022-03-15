// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.policyinsights.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


/**
 * The deployment status summary for all deployments created by the remediation.
 * 
 */
public final class RemediationDeploymentSummaryResponse extends io.pulumi.resources.InvokeArgs {

    public static final RemediationDeploymentSummaryResponse Empty = new RemediationDeploymentSummaryResponse();

    /**
     * The number of deployments required by the remediation that have failed.
     * 
     */
    @Import(name="failedDeployments", required=true)
      private final Integer failedDeployments;

    public Integer getFailedDeployments() {
        return this.failedDeployments;
    }

    /**
     * The number of deployments required by the remediation that have succeeded.
     * 
     */
    @Import(name="successfulDeployments", required=true)
      private final Integer successfulDeployments;

    public Integer getSuccessfulDeployments() {
        return this.successfulDeployments;
    }

    /**
     * The number of deployments required by the remediation.
     * 
     */
    @Import(name="totalDeployments", required=true)
      private final Integer totalDeployments;

    public Integer getTotalDeployments() {
        return this.totalDeployments;
    }

    public RemediationDeploymentSummaryResponse(
        Integer failedDeployments,
        Integer successfulDeployments,
        Integer totalDeployments) {
        this.failedDeployments = Objects.requireNonNull(failedDeployments, "expected parameter 'failedDeployments' to be non-null");
        this.successfulDeployments = Objects.requireNonNull(successfulDeployments, "expected parameter 'successfulDeployments' to be non-null");
        this.totalDeployments = Objects.requireNonNull(totalDeployments, "expected parameter 'totalDeployments' to be non-null");
    }

    private RemediationDeploymentSummaryResponse() {
        this.failedDeployments = null;
        this.successfulDeployments = null;
        this.totalDeployments = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RemediationDeploymentSummaryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer failedDeployments;
        private Integer successfulDeployments;
        private Integer totalDeployments;

        public Builder() {
    	      // Empty
        }

        public Builder(RemediationDeploymentSummaryResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.failedDeployments = defaults.failedDeployments;
    	      this.successfulDeployments = defaults.successfulDeployments;
    	      this.totalDeployments = defaults.totalDeployments;
        }

        public Builder failedDeployments(Integer failedDeployments) {
            this.failedDeployments = Objects.requireNonNull(failedDeployments);
            return this;
        }

        public Builder successfulDeployments(Integer successfulDeployments) {
            this.successfulDeployments = Objects.requireNonNull(successfulDeployments);
            return this;
        }

        public Builder totalDeployments(Integer totalDeployments) {
            this.totalDeployments = Objects.requireNonNull(totalDeployments);
            return this;
        }
        public RemediationDeploymentSummaryResponse build() {
            return new RemediationDeploymentSummaryResponse(failedDeployments, successfulDeployments, totalDeployments);
        }
    }
}
