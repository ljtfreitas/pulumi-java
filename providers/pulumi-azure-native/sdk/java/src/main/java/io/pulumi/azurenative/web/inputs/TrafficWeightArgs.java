// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Traffic weight assigned to a revision
 * 
 */
public final class TrafficWeightArgs extends io.pulumi.resources.ResourceArgs {

    public static final TrafficWeightArgs Empty = new TrafficWeightArgs();

    /**
     * Indicates that the traffic weight belongs to a latest stable revision
     * 
     */
    @Import(name="latestRevision")
      private final @Nullable Output<Boolean> latestRevision;

    public Output<Boolean> getLatestRevision() {
        return this.latestRevision == null ? Output.empty() : this.latestRevision;
    }

    /**
     * Name of a revision
     * 
     */
    @Import(name="revisionName")
      private final @Nullable Output<String> revisionName;

    public Output<String> getRevisionName() {
        return this.revisionName == null ? Output.empty() : this.revisionName;
    }

    /**
     * Traffic weight assigned to a revision
     * 
     */
    @Import(name="weight")
      private final @Nullable Output<Integer> weight;

    public Output<Integer> getWeight() {
        return this.weight == null ? Output.empty() : this.weight;
    }

    public TrafficWeightArgs(
        @Nullable Output<Boolean> latestRevision,
        @Nullable Output<String> revisionName,
        @Nullable Output<Integer> weight) {
        this.latestRevision = latestRevision == null ? Output.ofNullable(false) : latestRevision;
        this.revisionName = revisionName;
        this.weight = weight;
    }

    private TrafficWeightArgs() {
        this.latestRevision = Output.empty();
        this.revisionName = Output.empty();
        this.weight = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TrafficWeightArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> latestRevision;
        private @Nullable Output<String> revisionName;
        private @Nullable Output<Integer> weight;

        public Builder() {
    	      // Empty
        }

        public Builder(TrafficWeightArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.latestRevision = defaults.latestRevision;
    	      this.revisionName = defaults.revisionName;
    	      this.weight = defaults.weight;
        }

        public Builder latestRevision(@Nullable Output<Boolean> latestRevision) {
            this.latestRevision = latestRevision;
            return this;
        }

        public Builder latestRevision(@Nullable Boolean latestRevision) {
            this.latestRevision = Output.ofNullable(latestRevision);
            return this;
        }

        public Builder revisionName(@Nullable Output<String> revisionName) {
            this.revisionName = revisionName;
            return this;
        }

        public Builder revisionName(@Nullable String revisionName) {
            this.revisionName = Output.ofNullable(revisionName);
            return this;
        }

        public Builder weight(@Nullable Output<Integer> weight) {
            this.weight = weight;
            return this;
        }

        public Builder weight(@Nullable Integer weight) {
            this.weight = Output.ofNullable(weight);
            return this;
        }
        public TrafficWeightArgs build() {
            return new TrafficWeightArgs(latestRevision, revisionName, weight);
        }
    }
}
