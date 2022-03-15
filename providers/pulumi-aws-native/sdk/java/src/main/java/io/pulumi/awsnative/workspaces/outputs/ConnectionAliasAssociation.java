// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.workspaces.outputs;

import io.pulumi.awsnative.workspaces.enums.ConnectionAliasAssociationAssociationStatus;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConnectionAliasAssociation {
    private final @Nullable String associatedAccountId;
    private final @Nullable ConnectionAliasAssociationAssociationStatus associationStatus;
    private final @Nullable String connectionIdentifier;
    private final @Nullable String resourceId;

    @CustomType.Constructor
    private ConnectionAliasAssociation(
        @CustomType.Parameter("associatedAccountId") @Nullable String associatedAccountId,
        @CustomType.Parameter("associationStatus") @Nullable ConnectionAliasAssociationAssociationStatus associationStatus,
        @CustomType.Parameter("connectionIdentifier") @Nullable String connectionIdentifier,
        @CustomType.Parameter("resourceId") @Nullable String resourceId) {
        this.associatedAccountId = associatedAccountId;
        this.associationStatus = associationStatus;
        this.connectionIdentifier = connectionIdentifier;
        this.resourceId = resourceId;
    }

    public Optional<String> getAssociatedAccountId() {
        return Optional.ofNullable(this.associatedAccountId);
    }
    public Optional<ConnectionAliasAssociationAssociationStatus> getAssociationStatus() {
        return Optional.ofNullable(this.associationStatus);
    }
    public Optional<String> getConnectionIdentifier() {
        return Optional.ofNullable(this.connectionIdentifier);
    }
    public Optional<String> getResourceId() {
        return Optional.ofNullable(this.resourceId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionAliasAssociation defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String associatedAccountId;
        private @Nullable ConnectionAliasAssociationAssociationStatus associationStatus;
        private @Nullable String connectionIdentifier;
        private @Nullable String resourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionAliasAssociation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.associatedAccountId = defaults.associatedAccountId;
    	      this.associationStatus = defaults.associationStatus;
    	      this.connectionIdentifier = defaults.connectionIdentifier;
    	      this.resourceId = defaults.resourceId;
        }

        public Builder associatedAccountId(@Nullable String associatedAccountId) {
            this.associatedAccountId = associatedAccountId;
            return this;
        }

        public Builder associationStatus(@Nullable ConnectionAliasAssociationAssociationStatus associationStatus) {
            this.associationStatus = associationStatus;
            return this;
        }

        public Builder connectionIdentifier(@Nullable String connectionIdentifier) {
            this.connectionIdentifier = connectionIdentifier;
            return this;
        }

        public Builder resourceId(@Nullable String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public ConnectionAliasAssociation build() {
            return new ConnectionAliasAssociation(associatedAccountId, associationStatus, connectionIdentifier, resourceId);
        }
    }
}
