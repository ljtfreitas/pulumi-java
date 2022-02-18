// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.edgeorder.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Management resource preference to link device
 * 
 */
public final class ManagementResourcePreferencesArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagementResourcePreferencesArgs Empty = new ManagementResourcePreferencesArgs();

    /**
     * Customer preferred Management resource ARM ID
     * 
     */
    @InputImport(name="preferredManagementResourceId")
    private final @Nullable Input<String> preferredManagementResourceId;

    public Input<String> getPreferredManagementResourceId() {
        return this.preferredManagementResourceId == null ? Input.empty() : this.preferredManagementResourceId;
    }

    public ManagementResourcePreferencesArgs(@Nullable Input<String> preferredManagementResourceId) {
        this.preferredManagementResourceId = preferredManagementResourceId;
    }

    private ManagementResourcePreferencesArgs() {
        this.preferredManagementResourceId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagementResourcePreferencesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> preferredManagementResourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagementResourcePreferencesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.preferredManagementResourceId = defaults.preferredManagementResourceId;
        }

        public Builder setPreferredManagementResourceId(@Nullable Input<String> preferredManagementResourceId) {
            this.preferredManagementResourceId = preferredManagementResourceId;
            return this;
        }

        public Builder setPreferredManagementResourceId(@Nullable String preferredManagementResourceId) {
            this.preferredManagementResourceId = Input.ofNullable(preferredManagementResourceId);
            return this;
        }

        public ManagementResourcePreferencesArgs build() {
            return new ManagementResourcePreferencesArgs(preferredManagementResourceId);
        }
    }
}
