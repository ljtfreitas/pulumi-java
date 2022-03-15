// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A single flow version with specified traffic allocation.
 * 
 */
public final class GoogleCloudDialogflowCxV3VersionVariantsVariantArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowCxV3VersionVariantsVariantArgs Empty = new GoogleCloudDialogflowCxV3VersionVariantsVariantArgs();

    /**
     * Whether the variant is for the control group.
     * 
     */
    @Import(name="isControlGroup")
      private final @Nullable Output<Boolean> isControlGroup;

    public Output<Boolean> getIsControlGroup() {
        return this.isControlGroup == null ? Output.empty() : this.isControlGroup;
    }

    /**
     * Percentage of the traffic which should be routed to this version of flow. Traffic allocation for a single flow must sum up to 1.0.
     * 
     */
    @Import(name="trafficAllocation")
      private final @Nullable Output<Double> trafficAllocation;

    public Output<Double> getTrafficAllocation() {
        return this.trafficAllocation == null ? Output.empty() : this.trafficAllocation;
    }

    /**
     * The name of the flow version. Format: `projects//locations//agents//flows//versions/`.
     * 
     */
    @Import(name="version")
      private final @Nullable Output<String> version;

    public Output<String> getVersion() {
        return this.version == null ? Output.empty() : this.version;
    }

    public GoogleCloudDialogflowCxV3VersionVariantsVariantArgs(
        @Nullable Output<Boolean> isControlGroup,
        @Nullable Output<Double> trafficAllocation,
        @Nullable Output<String> version) {
        this.isControlGroup = isControlGroup;
        this.trafficAllocation = trafficAllocation;
        this.version = version;
    }

    private GoogleCloudDialogflowCxV3VersionVariantsVariantArgs() {
        this.isControlGroup = Output.empty();
        this.trafficAllocation = Output.empty();
        this.version = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3VersionVariantsVariantArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> isControlGroup;
        private @Nullable Output<Double> trafficAllocation;
        private @Nullable Output<String> version;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3VersionVariantsVariantArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isControlGroup = defaults.isControlGroup;
    	      this.trafficAllocation = defaults.trafficAllocation;
    	      this.version = defaults.version;
        }

        public Builder isControlGroup(@Nullable Output<Boolean> isControlGroup) {
            this.isControlGroup = isControlGroup;
            return this;
        }

        public Builder isControlGroup(@Nullable Boolean isControlGroup) {
            this.isControlGroup = Output.ofNullable(isControlGroup);
            return this;
        }

        public Builder trafficAllocation(@Nullable Output<Double> trafficAllocation) {
            this.trafficAllocation = trafficAllocation;
            return this;
        }

        public Builder trafficAllocation(@Nullable Double trafficAllocation) {
            this.trafficAllocation = Output.ofNullable(trafficAllocation);
            return this;
        }

        public Builder version(@Nullable Output<String> version) {
            this.version = version;
            return this;
        }

        public Builder version(@Nullable String version) {
            this.version = Output.ofNullable(version);
            return this;
        }
        public GoogleCloudDialogflowCxV3VersionVariantsVariantArgs build() {
            return new GoogleCloudDialogflowCxV3VersionVariantsVariantArgs(isControlGroup, trafficAllocation, version);
        }
    }
}
