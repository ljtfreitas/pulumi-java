// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.binaryauthorization.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.binaryauthorization.inputs.AttestorAttestationAuthorityNotePublicKeyPkixPublicKeyArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AttestorAttestationAuthorityNotePublicKeyArgs extends io.pulumi.resources.ResourceArgs {

    public static final AttestorAttestationAuthorityNotePublicKeyArgs Empty = new AttestorAttestationAuthorityNotePublicKeyArgs();

    /**
     * ASCII-armored representation of a PGP public key, as the
     * entire output by the command
     * `gpg --export --armor foo@example.com` (either LF or CRLF
     * line endings). When using this field, id should be left
     * blank. The BinAuthz API handlers will calculate the ID
     * and fill it in automatically. BinAuthz computes this ID
     * as the OpenPGP RFC4880 V4 fingerprint, represented as
     * upper-case hex. If id is provided by the caller, it will
     * be overwritten by the API-calculated ID.
     * 
     */
    @InputImport(name="asciiArmoredPgpPublicKey")
        private final @Nullable Input<String> asciiArmoredPgpPublicKey;

    public Input<String> getAsciiArmoredPgpPublicKey() {
        return this.asciiArmoredPgpPublicKey == null ? Input.empty() : this.asciiArmoredPgpPublicKey;
    }

    /**
     * A descriptive comment. This field may be updated.
     * 
     */
    @InputImport(name="comment")
        private final @Nullable Input<String> comment;

    public Input<String> getComment() {
        return this.comment == null ? Input.empty() : this.comment;
    }

    /**
     * The ID of this public key. Signatures verified by BinAuthz
     * must include the ID of the public key that can be used to
     * verify them, and that ID must match the contents of this
     * field exactly. Additional restrictions on this field can
     * be imposed based on which public key type is encapsulated.
     * See the documentation on publicKey cases below for details.
     * 
     */
    @InputImport(name="id")
        private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    /**
     * A raw PKIX SubjectPublicKeyInfo format public key.
     * NOTE: id may be explicitly provided by the caller when using this
     * type of public key, but it MUST be a valid RFC3986 URI. If id is left
     * blank, a default one will be computed based on the digest of the DER
     * encoding of the public key.
     * Structure is documented below.
     * 
     */
    @InputImport(name="pkixPublicKey")
        private final @Nullable Input<AttestorAttestationAuthorityNotePublicKeyPkixPublicKeyArgs> pkixPublicKey;

    public Input<AttestorAttestationAuthorityNotePublicKeyPkixPublicKeyArgs> getPkixPublicKey() {
        return this.pkixPublicKey == null ? Input.empty() : this.pkixPublicKey;
    }

    public AttestorAttestationAuthorityNotePublicKeyArgs(
        @Nullable Input<String> asciiArmoredPgpPublicKey,
        @Nullable Input<String> comment,
        @Nullable Input<String> id,
        @Nullable Input<AttestorAttestationAuthorityNotePublicKeyPkixPublicKeyArgs> pkixPublicKey) {
        this.asciiArmoredPgpPublicKey = asciiArmoredPgpPublicKey;
        this.comment = comment;
        this.id = id;
        this.pkixPublicKey = pkixPublicKey;
    }

    private AttestorAttestationAuthorityNotePublicKeyArgs() {
        this.asciiArmoredPgpPublicKey = Input.empty();
        this.comment = Input.empty();
        this.id = Input.empty();
        this.pkixPublicKey = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AttestorAttestationAuthorityNotePublicKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> asciiArmoredPgpPublicKey;
        private @Nullable Input<String> comment;
        private @Nullable Input<String> id;
        private @Nullable Input<AttestorAttestationAuthorityNotePublicKeyPkixPublicKeyArgs> pkixPublicKey;

        public Builder() {
    	      // Empty
        }

        public Builder(AttestorAttestationAuthorityNotePublicKeyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.asciiArmoredPgpPublicKey = defaults.asciiArmoredPgpPublicKey;
    	      this.comment = defaults.comment;
    	      this.id = defaults.id;
    	      this.pkixPublicKey = defaults.pkixPublicKey;
        }

        public Builder setAsciiArmoredPgpPublicKey(@Nullable Input<String> asciiArmoredPgpPublicKey) {
            this.asciiArmoredPgpPublicKey = asciiArmoredPgpPublicKey;
            return this;
        }

        public Builder setAsciiArmoredPgpPublicKey(@Nullable String asciiArmoredPgpPublicKey) {
            this.asciiArmoredPgpPublicKey = Input.ofNullable(asciiArmoredPgpPublicKey);
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

        public Builder setId(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = Input.ofNullable(id);
            return this;
        }

        public Builder setPkixPublicKey(@Nullable Input<AttestorAttestationAuthorityNotePublicKeyPkixPublicKeyArgs> pkixPublicKey) {
            this.pkixPublicKey = pkixPublicKey;
            return this;
        }

        public Builder setPkixPublicKey(@Nullable AttestorAttestationAuthorityNotePublicKeyPkixPublicKeyArgs pkixPublicKey) {
            this.pkixPublicKey = Input.ofNullable(pkixPublicKey);
            return this;
        }
        public AttestorAttestationAuthorityNotePublicKeyArgs build() {
            return new AttestorAttestationAuthorityNotePublicKeyArgs(asciiArmoredPgpPublicKey, comment, id, pkixPublicKey);
        }
    }
}
