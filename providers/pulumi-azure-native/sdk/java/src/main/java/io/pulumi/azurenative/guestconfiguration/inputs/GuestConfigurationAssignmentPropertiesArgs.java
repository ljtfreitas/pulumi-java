// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.guestconfiguration.inputs;

import io.pulumi.azurenative.guestconfiguration.inputs.GuestConfigurationNavigationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Guest configuration assignment properties.
 * 
 */
public final class GuestConfigurationAssignmentPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final GuestConfigurationAssignmentPropertiesArgs Empty = new GuestConfigurationAssignmentPropertiesArgs();

    /**
     * The source which initiated the guest configuration assignment. Ex: Azure Policy
     * 
     */
    @InputImport(name="context")
    private final @Nullable Input<String> context;

    public Input<String> getContext() {
        return this.context == null ? Input.empty() : this.context;
    }

    /**
     * The guest configuration to assign.
     * 
     */
    @InputImport(name="guestConfiguration")
    private final @Nullable Input<GuestConfigurationNavigationArgs> guestConfiguration;

    public Input<GuestConfigurationNavigationArgs> getGuestConfiguration() {
        return this.guestConfiguration == null ? Input.empty() : this.guestConfiguration;
    }

    public GuestConfigurationAssignmentPropertiesArgs(
        @Nullable Input<String> context,
        @Nullable Input<GuestConfigurationNavigationArgs> guestConfiguration) {
        this.context = context;
        this.guestConfiguration = guestConfiguration;
    }

    private GuestConfigurationAssignmentPropertiesArgs() {
        this.context = Input.empty();
        this.guestConfiguration = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GuestConfigurationAssignmentPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> context;
        private @Nullable Input<GuestConfigurationNavigationArgs> guestConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(GuestConfigurationAssignmentPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.context = defaults.context;
    	      this.guestConfiguration = defaults.guestConfiguration;
        }

        public Builder setContext(@Nullable Input<String> context) {
            this.context = context;
            return this;
        }

        public Builder setContext(@Nullable String context) {
            this.context = Input.ofNullable(context);
            return this;
        }

        public Builder setGuestConfiguration(@Nullable Input<GuestConfigurationNavigationArgs> guestConfiguration) {
            this.guestConfiguration = guestConfiguration;
            return this;
        }

        public Builder setGuestConfiguration(@Nullable GuestConfigurationNavigationArgs guestConfiguration) {
            this.guestConfiguration = Input.ofNullable(guestConfiguration);
            return this;
        }

        public GuestConfigurationAssignmentPropertiesArgs build() {
            return new GuestConfigurationAssignmentPropertiesArgs(context, guestConfiguration);
        }
    }
}
