// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform.inputs;

import io.pulumi.azurenative.appplatform.inputs.BuildpacksGroupPropertiesResponse;
import io.pulumi.azurenative.appplatform.inputs.StackPropertiesResponse;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * KPack Builder properties payload
 * 
 */
public final class BuilderPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final BuilderPropertiesResponse Empty = new BuilderPropertiesResponse();

    /**
     * Builder buildpack groups.
     * 
     */
    @Import(name="buildpackGroups")
      private final @Nullable List<BuildpacksGroupPropertiesResponse> buildpackGroups;

    public List<BuildpacksGroupPropertiesResponse> getBuildpackGroups() {
        return this.buildpackGroups == null ? List.of() : this.buildpackGroups;
    }

    /**
     * Builder provision status.
     * 
     */
    @Import(name="provisioningState", required=true)
      private final String provisioningState;

    public String getProvisioningState() {
        return this.provisioningState;
    }

    /**
     * Builder cluster stack property.
     * 
     */
    @Import(name="stack")
      private final @Nullable StackPropertiesResponse stack;

    public Optional<StackPropertiesResponse> getStack() {
        return this.stack == null ? Optional.empty() : Optional.ofNullable(this.stack);
    }

    public BuilderPropertiesResponse(
        @Nullable List<BuildpacksGroupPropertiesResponse> buildpackGroups,
        String provisioningState,
        @Nullable StackPropertiesResponse stack) {
        this.buildpackGroups = buildpackGroups;
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
        this.stack = stack;
    }

    private BuilderPropertiesResponse() {
        this.buildpackGroups = List.of();
        this.provisioningState = null;
        this.stack = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BuilderPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<BuildpacksGroupPropertiesResponse> buildpackGroups;
        private String provisioningState;
        private @Nullable StackPropertiesResponse stack;

        public Builder() {
    	      // Empty
        }

        public Builder(BuilderPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.buildpackGroups = defaults.buildpackGroups;
    	      this.provisioningState = defaults.provisioningState;
    	      this.stack = defaults.stack;
        }

        public Builder buildpackGroups(@Nullable List<BuildpacksGroupPropertiesResponse> buildpackGroups) {
            this.buildpackGroups = buildpackGroups;
            return this;
        }

        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder stack(@Nullable StackPropertiesResponse stack) {
            this.stack = stack;
            return this;
        }
        public BuilderPropertiesResponse build() {
            return new BuilderPropertiesResponse(buildpackGroups, provisioningState, stack);
        }
    }
}
