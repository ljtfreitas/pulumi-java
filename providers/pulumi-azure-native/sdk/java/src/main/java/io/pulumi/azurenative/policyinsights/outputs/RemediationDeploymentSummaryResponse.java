// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.policyinsights.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;

@OutputCustomType
public final class RemediationDeploymentSummaryResponse {
    /**
     * The number of deployments required by the remediation that have failed.
     * 
     */
    private final Integer failedDeployments;
    /**
     * The number of deployments required by the remediation that have succeeded.
     * 
     */
    private final Integer successfulDeployments;
    /**
     * The number of deployments required by the remediation.
     * 
     */
    private final Integer totalDeployments;

    @OutputCustomType.Constructor({"failedDeployments","successfulDeployments","totalDeployments"})
    private RemediationDeploymentSummaryResponse(
        Integer failedDeployments,
        Integer successfulDeployments,
        Integer totalDeployments) {
        this.failedDeployments = Objects.requireNonNull(failedDeployments);
        this.successfulDeployments = Objects.requireNonNull(successfulDeployments);
        this.totalDeployments = Objects.requireNonNull(totalDeployments);
    }

    /**
     * The number of deployments required by the remediation that have failed.
     * 
     */
    public Integer getFailedDeployments() {
        return this.failedDeployments;
    }
    /**
     * The number of deployments required by the remediation that have succeeded.
     * 
     */
    public Integer getSuccessfulDeployments() {
        return this.successfulDeployments;
    }
    /**
     * The number of deployments required by the remediation.
     * 
     */
    public Integer getTotalDeployments() {
        return this.totalDeployments;
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

        public Builder setFailedDeployments(Integer failedDeployments) {
            this.failedDeployments = Objects.requireNonNull(failedDeployments);
            return this;
        }

        public Builder setSuccessfulDeployments(Integer successfulDeployments) {
            this.successfulDeployments = Objects.requireNonNull(successfulDeployments);
            return this;
        }

        public Builder setTotalDeployments(Integer totalDeployments) {
            this.totalDeployments = Objects.requireNonNull(totalDeployments);
            return this;
        }
        public RemediationDeploymentSummaryResponse build() {
            return new RemediationDeploymentSummaryResponse(failedDeployments, successfulDeployments, totalDeployments);
        }
    }
}
