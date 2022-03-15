// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ssm.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetParameterArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetParameterArgs Empty = new GetParameterArgs();

    /**
     * The name of the parameter.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * Whether to return decrypted `SecureString` value. Defaults to `true`.
     * 
     */
    @Import(name="withDecryption")
      private final @Nullable Boolean withDecryption;

    public Optional<Boolean> getWithDecryption() {
        return this.withDecryption == null ? Optional.empty() : Optional.ofNullable(this.withDecryption);
    }

    public GetParameterArgs(
        String name,
        @Nullable Boolean withDecryption) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.withDecryption = withDecryption;
    }

    private GetParameterArgs() {
        this.name = null;
        this.withDecryption = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetParameterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private @Nullable Boolean withDecryption;

        public Builder() {
    	      // Empty
        }

        public Builder(GetParameterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.withDecryption = defaults.withDecryption;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder withDecryption(@Nullable Boolean withDecryption) {
            this.withDecryption = withDecryption;
            return this;
        }
        public GetParameterArgs build() {
            return new GetParameterArgs(name, withDecryption);
        }
    }
}
