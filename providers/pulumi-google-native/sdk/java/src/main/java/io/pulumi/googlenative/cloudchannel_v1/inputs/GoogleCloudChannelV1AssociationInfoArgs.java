// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudchannel_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Association links that an entitlement has to other entitlements.
 * 
 */
public final class GoogleCloudChannelV1AssociationInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudChannelV1AssociationInfoArgs Empty = new GoogleCloudChannelV1AssociationInfoArgs();

    /**
     * The name of the base entitlement, for which this entitlement is an add-on.
     * 
     */
    @InputImport(name="baseEntitlement")
      private final @Nullable Input<String> baseEntitlement;

    public Input<String> getBaseEntitlement() {
        return this.baseEntitlement == null ? Input.empty() : this.baseEntitlement;
    }

    public GoogleCloudChannelV1AssociationInfoArgs(@Nullable Input<String> baseEntitlement) {
        this.baseEntitlement = baseEntitlement;
    }

    private GoogleCloudChannelV1AssociationInfoArgs() {
        this.baseEntitlement = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudChannelV1AssociationInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> baseEntitlement;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudChannelV1AssociationInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baseEntitlement = defaults.baseEntitlement;
        }

        public Builder setBaseEntitlement(@Nullable Input<String> baseEntitlement) {
            this.baseEntitlement = baseEntitlement;
            return this;
        }

        public Builder setBaseEntitlement(@Nullable String baseEntitlement) {
            this.baseEntitlement = Input.ofNullable(baseEntitlement);
            return this;
        }
        public GoogleCloudChannelV1AssociationInfoArgs build() {
            return new GoogleCloudChannelV1AssociationInfoArgs(baseEntitlement);
        }
    }
}
