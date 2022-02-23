// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.testing_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.testing_v1.inputs.GoogleAutoResponse;
import java.util.Objects;


/**
 * Identifies an account and how to log into it.
 * 
 */
public final class AccountResponse extends io.pulumi.resources.InvokeArgs {

    public static final AccountResponse Empty = new AccountResponse();

    /**
     * An automatic google login account.
     * 
     */
    @InputImport(name="googleAuto", required=true)
      private final GoogleAutoResponse googleAuto;

    public GoogleAutoResponse getGoogleAuto() {
        return this.googleAuto;
    }

    public AccountResponse(GoogleAutoResponse googleAuto) {
        this.googleAuto = Objects.requireNonNull(googleAuto, "expected parameter 'googleAuto' to be non-null");
    }

    private AccountResponse() {
        this.googleAuto = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccountResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleAutoResponse googleAuto;

        public Builder() {
    	      // Empty
        }

        public Builder(AccountResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.googleAuto = defaults.googleAuto;
        }

        public Builder setGoogleAuto(GoogleAutoResponse googleAuto) {
            this.googleAuto = Objects.requireNonNull(googleAuto);
            return this;
        }
        public AccountResponse build() {
            return new AccountResponse(googleAuto);
        }
    }
}
