// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetDiagnosticServiceTokenReadOnlyResult {
    /**
     * JWT token for accessing application insights diagnostic service data.
     * 
     */
    private final @Nullable String token;

    @OutputCustomType.Constructor({"token"})
    private GetDiagnosticServiceTokenReadOnlyResult(@Nullable String token) {
        this.token = token;
    }

    /**
     * JWT token for accessing application insights diagnostic service data.
     * 
     */
    public Optional<String> getToken() {
        return Optional.ofNullable(this.token);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDiagnosticServiceTokenReadOnlyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String token;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDiagnosticServiceTokenReadOnlyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.token = defaults.token;
        }

        public Builder setToken(@Nullable String token) {
            this.token = token;
            return this;
        }
        public GetDiagnosticServiceTokenReadOnlyResult build() {
            return new GetDiagnosticServiceTokenReadOnlyResult(token);
        }
    }
}
