// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.inputs;

import io.pulumi.aws.cloudfront.inputs.FieldLevelEncryptionProfileEncryptionEntitiesGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FieldLevelEncryptionProfileState extends io.pulumi.resources.ResourceArgs {

    public static final FieldLevelEncryptionProfileState Empty = new FieldLevelEncryptionProfileState();

    /**
     * Internal value used by CloudFront to allow future updates to the Field Level Encryption Profile.
     * 
     */
    @InputImport(name="callerReference")
    private final @Nullable Input<String> callerReference;

    public Input<String> getCallerReference() {
        return this.callerReference == null ? Input.empty() : this.callerReference;
    }

    /**
     * An optional comment about the Field Level Encryption Profile.
     * 
     */
    @InputImport(name="comment")
    private final @Nullable Input<String> comment;

    public Input<String> getComment() {
        return this.comment == null ? Input.empty() : this.comment;
    }

    /**
     * The encryption entities config block for field-level encryption profiles that contains an attribute `items` which includes the encryption key and field pattern specifications.
     * 
     */
    @InputImport(name="encryptionEntities")
    private final @Nullable Input<FieldLevelEncryptionProfileEncryptionEntitiesGetArgs> encryptionEntities;

    public Input<FieldLevelEncryptionProfileEncryptionEntitiesGetArgs> getEncryptionEntities() {
        return this.encryptionEntities == null ? Input.empty() : this.encryptionEntities;
    }

    /**
     * The current version of the Field Level Encryption Profile. For example: `E2QWRUHAPOMQZL`.
     * 
     */
    @InputImport(name="etag")
    private final @Nullable Input<String> etag;

    public Input<String> getEtag() {
        return this.etag == null ? Input.empty() : this.etag;
    }

    /**
     * The name of the Field Level Encryption Profile.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    public FieldLevelEncryptionProfileState(
        @Nullable Input<String> callerReference,
        @Nullable Input<String> comment,
        @Nullable Input<FieldLevelEncryptionProfileEncryptionEntitiesGetArgs> encryptionEntities,
        @Nullable Input<String> etag,
        @Nullable Input<String> name) {
        this.callerReference = callerReference;
        this.comment = comment;
        this.encryptionEntities = encryptionEntities;
        this.etag = etag;
        this.name = name;
    }

    private FieldLevelEncryptionProfileState() {
        this.callerReference = Input.empty();
        this.comment = Input.empty();
        this.encryptionEntities = Input.empty();
        this.etag = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FieldLevelEncryptionProfileState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> callerReference;
        private @Nullable Input<String> comment;
        private @Nullable Input<FieldLevelEncryptionProfileEncryptionEntitiesGetArgs> encryptionEntities;
        private @Nullable Input<String> etag;
        private @Nullable Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(FieldLevelEncryptionProfileState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.callerReference = defaults.callerReference;
    	      this.comment = defaults.comment;
    	      this.encryptionEntities = defaults.encryptionEntities;
    	      this.etag = defaults.etag;
    	      this.name = defaults.name;
        }

        public Builder setCallerReference(@Nullable Input<String> callerReference) {
            this.callerReference = callerReference;
            return this;
        }

        public Builder setCallerReference(@Nullable String callerReference) {
            this.callerReference = Input.ofNullable(callerReference);
            return this;
        }

        public Builder setComment(@Nullable Input<String> comment) {
            this.comment = comment;
            return this;
        }

        public Builder setComment(@Nullable String comment) {
            this.comment = Input.ofNullable(comment);
            return this;
        }

        public Builder setEncryptionEntities(@Nullable Input<FieldLevelEncryptionProfileEncryptionEntitiesGetArgs> encryptionEntities) {
            this.encryptionEntities = encryptionEntities;
            return this;
        }

        public Builder setEncryptionEntities(@Nullable FieldLevelEncryptionProfileEncryptionEntitiesGetArgs encryptionEntities) {
            this.encryptionEntities = Input.ofNullable(encryptionEntities);
            return this;
        }

        public Builder setEtag(@Nullable Input<String> etag) {
            this.etag = etag;
            return this;
        }

        public Builder setEtag(@Nullable String etag) {
            this.etag = Input.ofNullable(etag);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }
        public FieldLevelEncryptionProfileState build() {
            return new FieldLevelEncryptionProfileState(callerReference, comment, encryptionEntities, etag, name);
        }
    }
}
