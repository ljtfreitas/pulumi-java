// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.containeranalysis_v1.outputs.CompletenessResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class MetadataResponse {
    /**
     * The timestamp of when the build completed.
     * 
     */
    private final String buildFinishedOn;
    /**
     * Identifies the particular build invocation, which can be useful for finding associated logs or other ad-hoc analysis. The value SHOULD be globally unique, per in-toto Provenance spec.
     * 
     */
    private final String buildInvocationId;
    /**
     * The timestamp of when the build started.
     * 
     */
    private final String buildStartedOn;
    /**
     * Indicates that the builder claims certain fields in this message to be complete.
     * 
     */
    private final CompletenessResponse completeness;
    /**
     * If true, the builder claims that running the recipe on materials will produce bit-for-bit identical output.
     * 
     */
    private final Boolean reproducible;

    @OutputCustomType.Constructor({"buildFinishedOn","buildInvocationId","buildStartedOn","completeness","reproducible"})
    private MetadataResponse(
        String buildFinishedOn,
        String buildInvocationId,
        String buildStartedOn,
        CompletenessResponse completeness,
        Boolean reproducible) {
        this.buildFinishedOn = Objects.requireNonNull(buildFinishedOn);
        this.buildInvocationId = Objects.requireNonNull(buildInvocationId);
        this.buildStartedOn = Objects.requireNonNull(buildStartedOn);
        this.completeness = Objects.requireNonNull(completeness);
        this.reproducible = Objects.requireNonNull(reproducible);
    }

    /**
     * The timestamp of when the build completed.
     * 
     */
    public String getBuildFinishedOn() {
        return this.buildFinishedOn;
    }
    /**
     * Identifies the particular build invocation, which can be useful for finding associated logs or other ad-hoc analysis. The value SHOULD be globally unique, per in-toto Provenance spec.
     * 
     */
    public String getBuildInvocationId() {
        return this.buildInvocationId;
    }
    /**
     * The timestamp of when the build started.
     * 
     */
    public String getBuildStartedOn() {
        return this.buildStartedOn;
    }
    /**
     * Indicates that the builder claims certain fields in this message to be complete.
     * 
     */
    public CompletenessResponse getCompleteness() {
        return this.completeness;
    }
    /**
     * If true, the builder claims that running the recipe on materials will produce bit-for-bit identical output.
     * 
     */
    public Boolean getReproducible() {
        return this.reproducible;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetadataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String buildFinishedOn;
        private String buildInvocationId;
        private String buildStartedOn;
        private CompletenessResponse completeness;
        private Boolean reproducible;

        public Builder() {
    	      // Empty
        }

        public Builder(MetadataResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.buildFinishedOn = defaults.buildFinishedOn;
    	      this.buildInvocationId = defaults.buildInvocationId;
    	      this.buildStartedOn = defaults.buildStartedOn;
    	      this.completeness = defaults.completeness;
    	      this.reproducible = defaults.reproducible;
        }

        public Builder setBuildFinishedOn(String buildFinishedOn) {
            this.buildFinishedOn = Objects.requireNonNull(buildFinishedOn);
            return this;
        }

        public Builder setBuildInvocationId(String buildInvocationId) {
            this.buildInvocationId = Objects.requireNonNull(buildInvocationId);
            return this;
        }

        public Builder setBuildStartedOn(String buildStartedOn) {
            this.buildStartedOn = Objects.requireNonNull(buildStartedOn);
            return this;
        }

        public Builder setCompleteness(CompletenessResponse completeness) {
            this.completeness = Objects.requireNonNull(completeness);
            return this;
        }

        public Builder setReproducible(Boolean reproducible) {
            this.reproducible = Objects.requireNonNull(reproducible);
            return this;
        }
        public MetadataResponse build() {
            return new MetadataResponse(buildFinishedOn, buildInvocationId, buildStartedOn, completeness, reproducible);
        }
    }
}
