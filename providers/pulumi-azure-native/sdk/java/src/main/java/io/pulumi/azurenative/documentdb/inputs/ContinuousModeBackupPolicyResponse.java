// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * The object representing continuous mode backup policy.
 * 
 */
public final class ContinuousModeBackupPolicyResponse extends io.pulumi.resources.InvokeArgs {

    public static final ContinuousModeBackupPolicyResponse Empty = new ContinuousModeBackupPolicyResponse();

    /**
     * Describes the mode of backups.
     * Expected value is 'Continuous'.
     * 
     */
    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    public ContinuousModeBackupPolicyResponse(String type) {
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ContinuousModeBackupPolicyResponse() {
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContinuousModeBackupPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ContinuousModeBackupPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public ContinuousModeBackupPolicyResponse build() {
            return new ContinuousModeBackupPolicyResponse(type);
        }
    }
}
