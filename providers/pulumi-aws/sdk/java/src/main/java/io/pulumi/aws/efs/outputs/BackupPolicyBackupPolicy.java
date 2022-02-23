// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.efs.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class BackupPolicyBackupPolicy {
    /**
     * A status of the backup policy. Valid values: `ENABLED`, `DISABLED`.
     * 
     */
    private final String status;

    @OutputCustomType.Constructor({"status"})
    private BackupPolicyBackupPolicy(String status) {
        this.status = Objects.requireNonNull(status);
    }

    /**
     * A status of the backup policy. Valid values: `ENABLED`, `DISABLED`.
     * 
     */
    public String getStatus() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackupPolicyBackupPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(BackupPolicyBackupPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.status = defaults.status;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public BackupPolicyBackupPolicy build() {
            return new BackupPolicyBackupPolicy(status);
        }
    }
}
