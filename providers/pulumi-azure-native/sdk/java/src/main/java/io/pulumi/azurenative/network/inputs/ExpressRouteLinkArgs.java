// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.enums.ExpressRouteLinkAdminState;
import io.pulumi.azurenative.network.inputs.ExpressRouteLinkMacSecConfigArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * ExpressRouteLink child resource definition.
 * 
 */
public final class ExpressRouteLinkArgs extends io.pulumi.resources.ResourceArgs {

    public static final ExpressRouteLinkArgs Empty = new ExpressRouteLinkArgs();

    /**
     * Administrative state of the physical port.
     * 
     */
    @InputImport(name="adminState")
        private final @Nullable Input<Either<String,ExpressRouteLinkAdminState>> adminState;

    public Input<Either<String,ExpressRouteLinkAdminState>> getAdminState() {
        return this.adminState == null ? Input.empty() : this.adminState;
    }

    /**
     * Resource ID.
     * 
     */
    @InputImport(name="id")
        private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    /**
     * MacSec configuration.
     * 
     */
    @InputImport(name="macSecConfig")
        private final @Nullable Input<ExpressRouteLinkMacSecConfigArgs> macSecConfig;

    public Input<ExpressRouteLinkMacSecConfigArgs> getMacSecConfig() {
        return this.macSecConfig == null ? Input.empty() : this.macSecConfig;
    }

    /**
     * Name of child port resource that is unique among child port resources of the parent.
     * 
     */
    @InputImport(name="name")
        private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    public ExpressRouteLinkArgs(
        @Nullable Input<Either<String,ExpressRouteLinkAdminState>> adminState,
        @Nullable Input<String> id,
        @Nullable Input<ExpressRouteLinkMacSecConfigArgs> macSecConfig,
        @Nullable Input<String> name) {
        this.adminState = adminState;
        this.id = id;
        this.macSecConfig = macSecConfig;
        this.name = name;
    }

    private ExpressRouteLinkArgs() {
        this.adminState = Input.empty();
        this.id = Input.empty();
        this.macSecConfig = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExpressRouteLinkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<String,ExpressRouteLinkAdminState>> adminState;
        private @Nullable Input<String> id;
        private @Nullable Input<ExpressRouteLinkMacSecConfigArgs> macSecConfig;
        private @Nullable Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(ExpressRouteLinkArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adminState = defaults.adminState;
    	      this.id = defaults.id;
    	      this.macSecConfig = defaults.macSecConfig;
    	      this.name = defaults.name;
        }

        public Builder setAdminState(@Nullable Input<Either<String,ExpressRouteLinkAdminState>> adminState) {
            this.adminState = adminState;
            return this;
        }

        public Builder setAdminState(@Nullable Either<String,ExpressRouteLinkAdminState> adminState) {
            this.adminState = Input.ofNullable(adminState);
            return this;
        }

        public Builder setId(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = Input.ofNullable(id);
            return this;
        }

        public Builder setMacSecConfig(@Nullable Input<ExpressRouteLinkMacSecConfigArgs> macSecConfig) {
            this.macSecConfig = macSecConfig;
            return this;
        }

        public Builder setMacSecConfig(@Nullable ExpressRouteLinkMacSecConfigArgs macSecConfig) {
            this.macSecConfig = Input.ofNullable(macSecConfig);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }
        public ExpressRouteLinkArgs build() {
            return new ExpressRouteLinkArgs(adminState, id, macSecConfig, name);
        }
    }
}
