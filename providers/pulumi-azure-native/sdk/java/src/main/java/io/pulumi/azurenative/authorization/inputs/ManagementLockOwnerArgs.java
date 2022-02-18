// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.authorization.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Lock owner properties.
 * 
 */
public final class ManagementLockOwnerArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagementLockOwnerArgs Empty = new ManagementLockOwnerArgs();

    /**
     * The application ID of the lock owner.
     * 
     */
    @InputImport(name="applicationId")
    private final @Nullable Input<String> applicationId;

    public Input<String> getApplicationId() {
        return this.applicationId == null ? Input.empty() : this.applicationId;
    }

    public ManagementLockOwnerArgs(@Nullable Input<String> applicationId) {
        this.applicationId = applicationId;
    }

    private ManagementLockOwnerArgs() {
        this.applicationId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagementLockOwnerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> applicationId;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagementLockOwnerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationId = defaults.applicationId;
        }

        public Builder setApplicationId(@Nullable Input<String> applicationId) {
            this.applicationId = applicationId;
            return this;
        }

        public Builder setApplicationId(@Nullable String applicationId) {
            this.applicationId = Input.ofNullable(applicationId);
            return this;
        }

        public ManagementLockOwnerArgs build() {
            return new ManagementLockOwnerArgs(applicationId);
        }
    }
}
