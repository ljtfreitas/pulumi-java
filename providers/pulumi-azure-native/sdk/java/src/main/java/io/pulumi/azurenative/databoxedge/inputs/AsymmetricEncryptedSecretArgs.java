// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge.inputs;

import io.pulumi.azurenative.databoxedge.enums.EncryptionAlgorithm;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represent the secrets intended for encryption with asymmetric key pair.
 * 
 */
public final class AsymmetricEncryptedSecretArgs extends io.pulumi.resources.ResourceArgs {

    public static final AsymmetricEncryptedSecretArgs Empty = new AsymmetricEncryptedSecretArgs();

    /**
     * The algorithm used to encrypt "Value".
     * 
     */
    @InputImport(name="encryptionAlgorithm", required=true)
    private final Input<Either<String,EncryptionAlgorithm>> encryptionAlgorithm;

    public Input<Either<String,EncryptionAlgorithm>> getEncryptionAlgorithm() {
        return this.encryptionAlgorithm;
    }

    /**
     * Thumbprint certificate used to encrypt \"Value\". If the value is unencrypted, it will be null.
     * 
     */
    @InputImport(name="encryptionCertThumbprint")
    private final @Nullable Input<String> encryptionCertThumbprint;

    public Input<String> getEncryptionCertThumbprint() {
        return this.encryptionCertThumbprint == null ? Input.empty() : this.encryptionCertThumbprint;
    }

    /**
     * The value of the secret.
     * 
     */
    @InputImport(name="value", required=true)
    private final Input<String> value;

    public Input<String> getValue() {
        return this.value;
    }

    public AsymmetricEncryptedSecretArgs(
        Input<Either<String,EncryptionAlgorithm>> encryptionAlgorithm,
        @Nullable Input<String> encryptionCertThumbprint,
        Input<String> value) {
        this.encryptionAlgorithm = Objects.requireNonNull(encryptionAlgorithm, "expected parameter 'encryptionAlgorithm' to be non-null");
        this.encryptionCertThumbprint = encryptionCertThumbprint;
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private AsymmetricEncryptedSecretArgs() {
        this.encryptionAlgorithm = Input.empty();
        this.encryptionCertThumbprint = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AsymmetricEncryptedSecretArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Either<String,EncryptionAlgorithm>> encryptionAlgorithm;
        private @Nullable Input<String> encryptionCertThumbprint;
        private Input<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(AsymmetricEncryptedSecretArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryptionAlgorithm = defaults.encryptionAlgorithm;
    	      this.encryptionCertThumbprint = defaults.encryptionCertThumbprint;
    	      this.value = defaults.value;
        }

        public Builder setEncryptionAlgorithm(Input<Either<String,EncryptionAlgorithm>> encryptionAlgorithm) {
            this.encryptionAlgorithm = Objects.requireNonNull(encryptionAlgorithm);
            return this;
        }

        public Builder setEncryptionAlgorithm(Either<String,EncryptionAlgorithm> encryptionAlgorithm) {
            this.encryptionAlgorithm = Input.of(Objects.requireNonNull(encryptionAlgorithm));
            return this;
        }

        public Builder setEncryptionCertThumbprint(@Nullable Input<String> encryptionCertThumbprint) {
            this.encryptionCertThumbprint = encryptionCertThumbprint;
            return this;
        }

        public Builder setEncryptionCertThumbprint(@Nullable String encryptionCertThumbprint) {
            this.encryptionCertThumbprint = Input.ofNullable(encryptionCertThumbprint);
            return this;
        }

        public Builder setValue(Input<String> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public Builder setValue(String value) {
            this.value = Input.of(Objects.requireNonNull(value));
            return this;
        }

        public AsymmetricEncryptedSecretArgs build() {
            return new AsymmetricEncryptedSecretArgs(encryptionAlgorithm, encryptionCertThumbprint, value);
        }
    }
}
