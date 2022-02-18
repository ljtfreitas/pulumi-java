// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The Edifact schema reference.
 * 
 */
public final class EdifactSchemaReferenceArgs extends io.pulumi.resources.ResourceArgs {

    public static final EdifactSchemaReferenceArgs Empty = new EdifactSchemaReferenceArgs();

    /**
     * The association assigned code.
     * 
     */
    @InputImport(name="associationAssignedCode")
    private final @Nullable Input<String> associationAssignedCode;

    public Input<String> getAssociationAssignedCode() {
        return this.associationAssignedCode == null ? Input.empty() : this.associationAssignedCode;
    }

    /**
     * The message id.
     * 
     */
    @InputImport(name="messageId", required=true)
    private final Input<String> messageId;

    public Input<String> getMessageId() {
        return this.messageId;
    }

    /**
     * The message release version.
     * 
     */
    @InputImport(name="messageRelease", required=true)
    private final Input<String> messageRelease;

    public Input<String> getMessageRelease() {
        return this.messageRelease;
    }

    /**
     * The message version.
     * 
     */
    @InputImport(name="messageVersion", required=true)
    private final Input<String> messageVersion;

    public Input<String> getMessageVersion() {
        return this.messageVersion;
    }

    /**
     * The schema name.
     * 
     */
    @InputImport(name="schemaName", required=true)
    private final Input<String> schemaName;

    public Input<String> getSchemaName() {
        return this.schemaName;
    }

    /**
     * The sender application id.
     * 
     */
    @InputImport(name="senderApplicationId")
    private final @Nullable Input<String> senderApplicationId;

    public Input<String> getSenderApplicationId() {
        return this.senderApplicationId == null ? Input.empty() : this.senderApplicationId;
    }

    /**
     * The sender application qualifier.
     * 
     */
    @InputImport(name="senderApplicationQualifier")
    private final @Nullable Input<String> senderApplicationQualifier;

    public Input<String> getSenderApplicationQualifier() {
        return this.senderApplicationQualifier == null ? Input.empty() : this.senderApplicationQualifier;
    }

    public EdifactSchemaReferenceArgs(
        @Nullable Input<String> associationAssignedCode,
        Input<String> messageId,
        Input<String> messageRelease,
        Input<String> messageVersion,
        Input<String> schemaName,
        @Nullable Input<String> senderApplicationId,
        @Nullable Input<String> senderApplicationQualifier) {
        this.associationAssignedCode = associationAssignedCode;
        this.messageId = Objects.requireNonNull(messageId, "expected parameter 'messageId' to be non-null");
        this.messageRelease = Objects.requireNonNull(messageRelease, "expected parameter 'messageRelease' to be non-null");
        this.messageVersion = Objects.requireNonNull(messageVersion, "expected parameter 'messageVersion' to be non-null");
        this.schemaName = Objects.requireNonNull(schemaName, "expected parameter 'schemaName' to be non-null");
        this.senderApplicationId = senderApplicationId;
        this.senderApplicationQualifier = senderApplicationQualifier;
    }

    private EdifactSchemaReferenceArgs() {
        this.associationAssignedCode = Input.empty();
        this.messageId = Input.empty();
        this.messageRelease = Input.empty();
        this.messageVersion = Input.empty();
        this.schemaName = Input.empty();
        this.senderApplicationId = Input.empty();
        this.senderApplicationQualifier = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EdifactSchemaReferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> associationAssignedCode;
        private Input<String> messageId;
        private Input<String> messageRelease;
        private Input<String> messageVersion;
        private Input<String> schemaName;
        private @Nullable Input<String> senderApplicationId;
        private @Nullable Input<String> senderApplicationQualifier;

        public Builder() {
    	      // Empty
        }

        public Builder(EdifactSchemaReferenceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.associationAssignedCode = defaults.associationAssignedCode;
    	      this.messageId = defaults.messageId;
    	      this.messageRelease = defaults.messageRelease;
    	      this.messageVersion = defaults.messageVersion;
    	      this.schemaName = defaults.schemaName;
    	      this.senderApplicationId = defaults.senderApplicationId;
    	      this.senderApplicationQualifier = defaults.senderApplicationQualifier;
        }

        public Builder setAssociationAssignedCode(@Nullable Input<String> associationAssignedCode) {
            this.associationAssignedCode = associationAssignedCode;
            return this;
        }

        public Builder setAssociationAssignedCode(@Nullable String associationAssignedCode) {
            this.associationAssignedCode = Input.ofNullable(associationAssignedCode);
            return this;
        }

        public Builder setMessageId(Input<String> messageId) {
            this.messageId = Objects.requireNonNull(messageId);
            return this;
        }

        public Builder setMessageId(String messageId) {
            this.messageId = Input.of(Objects.requireNonNull(messageId));
            return this;
        }

        public Builder setMessageRelease(Input<String> messageRelease) {
            this.messageRelease = Objects.requireNonNull(messageRelease);
            return this;
        }

        public Builder setMessageRelease(String messageRelease) {
            this.messageRelease = Input.of(Objects.requireNonNull(messageRelease));
            return this;
        }

        public Builder setMessageVersion(Input<String> messageVersion) {
            this.messageVersion = Objects.requireNonNull(messageVersion);
            return this;
        }

        public Builder setMessageVersion(String messageVersion) {
            this.messageVersion = Input.of(Objects.requireNonNull(messageVersion));
            return this;
        }

        public Builder setSchemaName(Input<String> schemaName) {
            this.schemaName = Objects.requireNonNull(schemaName);
            return this;
        }

        public Builder setSchemaName(String schemaName) {
            this.schemaName = Input.of(Objects.requireNonNull(schemaName));
            return this;
        }

        public Builder setSenderApplicationId(@Nullable Input<String> senderApplicationId) {
            this.senderApplicationId = senderApplicationId;
            return this;
        }

        public Builder setSenderApplicationId(@Nullable String senderApplicationId) {
            this.senderApplicationId = Input.ofNullable(senderApplicationId);
            return this;
        }

        public Builder setSenderApplicationQualifier(@Nullable Input<String> senderApplicationQualifier) {
            this.senderApplicationQualifier = senderApplicationQualifier;
            return this;
        }

        public Builder setSenderApplicationQualifier(@Nullable String senderApplicationQualifier) {
            this.senderApplicationQualifier = Input.ofNullable(senderApplicationQualifier);
            return this;
        }

        public EdifactSchemaReferenceArgs build() {
            return new EdifactSchemaReferenceArgs(associationAssignedCode, messageId, messageRelease, messageVersion, schemaName, senderApplicationId, senderApplicationQualifier);
        }
    }
}
