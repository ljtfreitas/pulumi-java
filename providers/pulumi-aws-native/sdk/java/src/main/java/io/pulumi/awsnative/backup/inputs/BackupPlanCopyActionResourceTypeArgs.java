// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.backup.inputs;

import io.pulumi.awsnative.backup.inputs.BackupPlanLifecycleResourceTypeArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BackupPlanCopyActionResourceTypeArgs extends io.pulumi.resources.ResourceArgs {

    public static final BackupPlanCopyActionResourceTypeArgs Empty = new BackupPlanCopyActionResourceTypeArgs();

    @InputImport(name="destinationBackupVaultArn", required=true)
        private final Input<String> destinationBackupVaultArn;

    public Input<String> getDestinationBackupVaultArn() {
        return this.destinationBackupVaultArn;
    }

    @InputImport(name="lifecycle")
        private final @Nullable Input<BackupPlanLifecycleResourceTypeArgs> lifecycle;

    public Input<BackupPlanLifecycleResourceTypeArgs> getLifecycle() {
        return this.lifecycle == null ? Input.empty() : this.lifecycle;
    }

    public BackupPlanCopyActionResourceTypeArgs(
        Input<String> destinationBackupVaultArn,
        @Nullable Input<BackupPlanLifecycleResourceTypeArgs> lifecycle) {
        this.destinationBackupVaultArn = Objects.requireNonNull(destinationBackupVaultArn, "expected parameter 'destinationBackupVaultArn' to be non-null");
        this.lifecycle = lifecycle;
    }

    private BackupPlanCopyActionResourceTypeArgs() {
        this.destinationBackupVaultArn = Input.empty();
        this.lifecycle = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackupPlanCopyActionResourceTypeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> destinationBackupVaultArn;
        private @Nullable Input<BackupPlanLifecycleResourceTypeArgs> lifecycle;

        public Builder() {
    	      // Empty
        }

        public Builder(BackupPlanCopyActionResourceTypeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinationBackupVaultArn = defaults.destinationBackupVaultArn;
    	      this.lifecycle = defaults.lifecycle;
        }

        public Builder setDestinationBackupVaultArn(Input<String> destinationBackupVaultArn) {
            this.destinationBackupVaultArn = Objects.requireNonNull(destinationBackupVaultArn);
            return this;
        }

        public Builder setDestinationBackupVaultArn(String destinationBackupVaultArn) {
            this.destinationBackupVaultArn = Input.of(Objects.requireNonNull(destinationBackupVaultArn));
            return this;
        }

        public Builder setLifecycle(@Nullable Input<BackupPlanLifecycleResourceTypeArgs> lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        public Builder setLifecycle(@Nullable BackupPlanLifecycleResourceTypeArgs lifecycle) {
            this.lifecycle = Input.ofNullable(lifecycle);
            return this;
        }
        public BackupPlanCopyActionResourceTypeArgs build() {
            return new BackupPlanCopyActionResourceTypeArgs(destinationBackupVaultArn, lifecycle);
        }
    }
}
