// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.backup.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetBackupPlanArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetBackupPlanArgs Empty = new GetBackupPlanArgs();

    @InputImport(name="backupPlanId", required=true)
        private final String backupPlanId;

    public String getBackupPlanId() {
        return this.backupPlanId;
    }

    public GetBackupPlanArgs(String backupPlanId) {
        this.backupPlanId = Objects.requireNonNull(backupPlanId, "expected parameter 'backupPlanId' to be non-null");
    }

    private GetBackupPlanArgs() {
        this.backupPlanId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBackupPlanArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String backupPlanId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBackupPlanArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupPlanId = defaults.backupPlanId;
        }

        public Builder setBackupPlanId(String backupPlanId) {
            this.backupPlanId = Objects.requireNonNull(backupPlanId);
            return this;
        }
        public GetBackupPlanArgs build() {
            return new GetBackupPlanArgs(backupPlanId);
        }
    }
}
