// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TrafficWeightResponse {
    /**
     * Indicates that the traffic weight belongs to a latest stable revision
     * 
     */
    private final @Nullable Boolean latestRevision;
    /**
     * Name of a revision
     * 
     */
    private final @Nullable String revisionName;
    /**
     * Traffic weight assigned to a revision
     * 
     */
    private final @Nullable Integer weight;

    @CustomType.Constructor
    private TrafficWeightResponse(
        @CustomType.Parameter("latestRevision") @Nullable Boolean latestRevision,
        @CustomType.Parameter("revisionName") @Nullable String revisionName,
        @CustomType.Parameter("weight") @Nullable Integer weight) {
        this.latestRevision = latestRevision;
        this.revisionName = revisionName;
        this.weight = weight;
    }

    /**
     * Indicates that the traffic weight belongs to a latest stable revision
     * 
    */
    public Optional<Boolean> getLatestRevision() {
        return Optional.ofNullable(this.latestRevision);
    }
    /**
     * Name of a revision
     * 
    */
    public Optional<String> getRevisionName() {
        return Optional.ofNullable(this.revisionName);
    }
    /**
     * Traffic weight assigned to a revision
     * 
    */
    public Optional<Integer> getWeight() {
        return Optional.ofNullable(this.weight);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TrafficWeightResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean latestRevision;
        private @Nullable String revisionName;
        private @Nullable Integer weight;

        public Builder() {
    	      // Empty
        }

        public Builder(TrafficWeightResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.latestRevision = defaults.latestRevision;
    	      this.revisionName = defaults.revisionName;
    	      this.weight = defaults.weight;
        }

        public Builder latestRevision(@Nullable Boolean latestRevision) {
            this.latestRevision = latestRevision;
            return this;
        }

        public Builder revisionName(@Nullable String revisionName) {
            this.revisionName = revisionName;
            return this;
        }

        public Builder weight(@Nullable Integer weight) {
            this.weight = weight;
            return this;
        }
        public TrafficWeightResponse build() {
            return new TrafficWeightResponse(latestRevision, revisionName, weight);
        }
    }
}
