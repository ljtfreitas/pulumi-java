// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Traffic weight assigned to a revision
 * 
 */
public final class TrafficWeightResponse extends io.pulumi.resources.InvokeArgs {

    public static final TrafficWeightResponse Empty = new TrafficWeightResponse();

    /**
     * Indicates that the traffic weight belongs to a latest stable revision
     * 
     */
    @Import(name="latestRevision")
      private final @Nullable Boolean latestRevision;

    public Optional<Boolean> getLatestRevision() {
        return this.latestRevision == null ? Optional.empty() : Optional.ofNullable(this.latestRevision);
    }

    /**
     * Name of a revision
     * 
     */
    @Import(name="revisionName")
      private final @Nullable String revisionName;

    public Optional<String> getRevisionName() {
        return this.revisionName == null ? Optional.empty() : Optional.ofNullable(this.revisionName);
    }

    /**
     * Traffic weight assigned to a revision
     * 
     */
    @Import(name="weight")
      private final @Nullable Integer weight;

    public Optional<Integer> getWeight() {
        return this.weight == null ? Optional.empty() : Optional.ofNullable(this.weight);
    }

    public TrafficWeightResponse(
        @Nullable Boolean latestRevision,
        @Nullable String revisionName,
        @Nullable Integer weight) {
        this.latestRevision = latestRevision == null ? false : latestRevision;
        this.revisionName = revisionName;
        this.weight = weight;
    }

    private TrafficWeightResponse() {
        this.latestRevision = null;
        this.revisionName = null;
        this.weight = null;
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
