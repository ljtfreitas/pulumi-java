// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.secretmanager_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.secretmanager_v1.inputs.AutomaticArgs;
import io.pulumi.googlenative.secretmanager_v1.inputs.UserManagedArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A policy that defines the replication and encryption configuration of data.
 * 
 */
public final class ReplicationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReplicationArgs Empty = new ReplicationArgs();

    /**
     * The Secret will automatically be replicated without any restrictions.
     * 
     */
    @InputImport(name="automatic")
      private final @Nullable Input<AutomaticArgs> automatic;

    public Input<AutomaticArgs> getAutomatic() {
        return this.automatic == null ? Input.empty() : this.automatic;
    }

    /**
     * The Secret will only be replicated into the locations specified.
     * 
     */
    @InputImport(name="userManaged")
      private final @Nullable Input<UserManagedArgs> userManaged;

    public Input<UserManagedArgs> getUserManaged() {
        return this.userManaged == null ? Input.empty() : this.userManaged;
    }

    public ReplicationArgs(
        @Nullable Input<AutomaticArgs> automatic,
        @Nullable Input<UserManagedArgs> userManaged) {
        this.automatic = automatic;
        this.userManaged = userManaged;
    }

    private ReplicationArgs() {
        this.automatic = Input.empty();
        this.userManaged = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReplicationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<AutomaticArgs> automatic;
        private @Nullable Input<UserManagedArgs> userManaged;

        public Builder() {
    	      // Empty
        }

        public Builder(ReplicationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.automatic = defaults.automatic;
    	      this.userManaged = defaults.userManaged;
        }

        public Builder setAutomatic(@Nullable Input<AutomaticArgs> automatic) {
            this.automatic = automatic;
            return this;
        }

        public Builder setAutomatic(@Nullable AutomaticArgs automatic) {
            this.automatic = Input.ofNullable(automatic);
            return this;
        }

        public Builder setUserManaged(@Nullable Input<UserManagedArgs> userManaged) {
            this.userManaged = userManaged;
            return this;
        }

        public Builder setUserManaged(@Nullable UserManagedArgs userManaged) {
            this.userManaged = Input.ofNullable(userManaged);
            return this;
        }
        public ReplicationArgs build() {
            return new ReplicationArgs(automatic, userManaged);
        }
    }
}
