// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Information about migration eligibility of a server object
 * 
 */
public final class MigrationEligibilityInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final MigrationEligibilityInfoResponse Empty = new MigrationEligibilityInfoResponse();

    /**
     * Whether object is eligible for migration or not.
     * 
     */
    @Import(name="isEligibleForMigration", required=true)
      private final Boolean isEligibleForMigration;

    public Boolean getIsEligibleForMigration() {
        return this.isEligibleForMigration;
    }

    /**
     * Information about eligibility failure for the server object.
     * 
     */
    @Import(name="validationMessages", required=true)
      private final List<String> validationMessages;

    public List<String> getValidationMessages() {
        return this.validationMessages;
    }

    public MigrationEligibilityInfoResponse(
        Boolean isEligibleForMigration,
        List<String> validationMessages) {
        this.isEligibleForMigration = Objects.requireNonNull(isEligibleForMigration, "expected parameter 'isEligibleForMigration' to be non-null");
        this.validationMessages = Objects.requireNonNull(validationMessages, "expected parameter 'validationMessages' to be non-null");
    }

    private MigrationEligibilityInfoResponse() {
        this.isEligibleForMigration = null;
        this.validationMessages = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MigrationEligibilityInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean isEligibleForMigration;
        private List<String> validationMessages;

        public Builder() {
    	      // Empty
        }

        public Builder(MigrationEligibilityInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isEligibleForMigration = defaults.isEligibleForMigration;
    	      this.validationMessages = defaults.validationMessages;
        }

        public Builder isEligibleForMigration(Boolean isEligibleForMigration) {
            this.isEligibleForMigration = Objects.requireNonNull(isEligibleForMigration);
            return this;
        }

        public Builder validationMessages(List<String> validationMessages) {
            this.validationMessages = Objects.requireNonNull(validationMessages);
            return this;
        }
        public MigrationEligibilityInfoResponse build() {
            return new MigrationEligibilityInfoResponse(isEligibleForMigration, validationMessages);
        }
    }
}
