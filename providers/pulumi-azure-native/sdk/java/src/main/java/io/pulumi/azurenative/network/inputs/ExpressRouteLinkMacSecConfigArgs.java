// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.enums.ExpressRouteLinkMacSecCipher;
import io.pulumi.azurenative.network.enums.ExpressRouteLinkMacSecSciState;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * ExpressRouteLink Mac Security Configuration.
 * 
 */
public final class ExpressRouteLinkMacSecConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ExpressRouteLinkMacSecConfigArgs Empty = new ExpressRouteLinkMacSecConfigArgs();

    /**
     * Keyvault Secret Identifier URL containing Mac security CAK key.
     * 
     */
    @InputImport(name="cakSecretIdentifier")
    private final @Nullable Input<String> cakSecretIdentifier;

    public Input<String> getCakSecretIdentifier() {
        return this.cakSecretIdentifier == null ? Input.empty() : this.cakSecretIdentifier;
    }

    /**
     * Mac security cipher.
     * 
     */
    @InputImport(name="cipher")
    private final @Nullable Input<Either<String,ExpressRouteLinkMacSecCipher>> cipher;

    public Input<Either<String,ExpressRouteLinkMacSecCipher>> getCipher() {
        return this.cipher == null ? Input.empty() : this.cipher;
    }

    /**
     * Keyvault Secret Identifier URL containing Mac security CKN key.
     * 
     */
    @InputImport(name="cknSecretIdentifier")
    private final @Nullable Input<String> cknSecretIdentifier;

    public Input<String> getCknSecretIdentifier() {
        return this.cknSecretIdentifier == null ? Input.empty() : this.cknSecretIdentifier;
    }

    /**
     * Sci mode enabled/disabled.
     * 
     */
    @InputImport(name="sciState")
    private final @Nullable Input<Either<String,ExpressRouteLinkMacSecSciState>> sciState;

    public Input<Either<String,ExpressRouteLinkMacSecSciState>> getSciState() {
        return this.sciState == null ? Input.empty() : this.sciState;
    }

    public ExpressRouteLinkMacSecConfigArgs(
        @Nullable Input<String> cakSecretIdentifier,
        @Nullable Input<Either<String,ExpressRouteLinkMacSecCipher>> cipher,
        @Nullable Input<String> cknSecretIdentifier,
        @Nullable Input<Either<String,ExpressRouteLinkMacSecSciState>> sciState) {
        this.cakSecretIdentifier = cakSecretIdentifier;
        this.cipher = cipher;
        this.cknSecretIdentifier = cknSecretIdentifier;
        this.sciState = sciState;
    }

    private ExpressRouteLinkMacSecConfigArgs() {
        this.cakSecretIdentifier = Input.empty();
        this.cipher = Input.empty();
        this.cknSecretIdentifier = Input.empty();
        this.sciState = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExpressRouteLinkMacSecConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> cakSecretIdentifier;
        private @Nullable Input<Either<String,ExpressRouteLinkMacSecCipher>> cipher;
        private @Nullable Input<String> cknSecretIdentifier;
        private @Nullable Input<Either<String,ExpressRouteLinkMacSecSciState>> sciState;

        public Builder() {
    	      // Empty
        }

        public Builder(ExpressRouteLinkMacSecConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cakSecretIdentifier = defaults.cakSecretIdentifier;
    	      this.cipher = defaults.cipher;
    	      this.cknSecretIdentifier = defaults.cknSecretIdentifier;
    	      this.sciState = defaults.sciState;
        }

        public Builder setCakSecretIdentifier(@Nullable Input<String> cakSecretIdentifier) {
            this.cakSecretIdentifier = cakSecretIdentifier;
            return this;
        }

        public Builder setCakSecretIdentifier(@Nullable String cakSecretIdentifier) {
            this.cakSecretIdentifier = Input.ofNullable(cakSecretIdentifier);
            return this;
        }

        public Builder setCipher(@Nullable Input<Either<String,ExpressRouteLinkMacSecCipher>> cipher) {
            this.cipher = cipher;
            return this;
        }

        public Builder setCipher(@Nullable Either<String,ExpressRouteLinkMacSecCipher> cipher) {
            this.cipher = Input.ofNullable(cipher);
            return this;
        }

        public Builder setCknSecretIdentifier(@Nullable Input<String> cknSecretIdentifier) {
            this.cknSecretIdentifier = cknSecretIdentifier;
            return this;
        }

        public Builder setCknSecretIdentifier(@Nullable String cknSecretIdentifier) {
            this.cknSecretIdentifier = Input.ofNullable(cknSecretIdentifier);
            return this;
        }

        public Builder setSciState(@Nullable Input<Either<String,ExpressRouteLinkMacSecSciState>> sciState) {
            this.sciState = sciState;
            return this;
        }

        public Builder setSciState(@Nullable Either<String,ExpressRouteLinkMacSecSciState> sciState) {
            this.sciState = Input.ofNullable(sciState);
            return this;
        }

        public ExpressRouteLinkMacSecConfigArgs build() {
            return new ExpressRouteLinkMacSecConfigArgs(cakSecretIdentifier, cipher, cknSecretIdentifier, sciState);
        }
    }
}
