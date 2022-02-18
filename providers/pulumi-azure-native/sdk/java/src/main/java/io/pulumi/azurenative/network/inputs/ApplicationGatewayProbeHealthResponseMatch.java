// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Application gateway probe health response match.
 * 
 */
public final class ApplicationGatewayProbeHealthResponseMatch extends io.pulumi.resources.InvokeArgs {

    public static final ApplicationGatewayProbeHealthResponseMatch Empty = new ApplicationGatewayProbeHealthResponseMatch();

    /**
     * Body that must be contained in the health response. Default value is empty.
     * 
     */
    @InputImport(name="body")
    private final @Nullable String body;

    public Optional<String> getBody() {
        return this.body == null ? Optional.empty() : Optional.ofNullable(this.body);
    }

    /**
     * Allowed ranges of healthy status codes. Default range of healthy status codes is 200-399.
     * 
     */
    @InputImport(name="statusCodes")
    private final @Nullable List<String> statusCodes;

    public List<String> getStatusCodes() {
        return this.statusCodes == null ? List.of() : this.statusCodes;
    }

    public ApplicationGatewayProbeHealthResponseMatch(
        @Nullable String body,
        @Nullable List<String> statusCodes) {
        this.body = body;
        this.statusCodes = statusCodes;
    }

    private ApplicationGatewayProbeHealthResponseMatch() {
        this.body = null;
        this.statusCodes = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationGatewayProbeHealthResponseMatch defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String body;
        private @Nullable List<String> statusCodes;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationGatewayProbeHealthResponseMatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.body = defaults.body;
    	      this.statusCodes = defaults.statusCodes;
        }

        public Builder setBody(@Nullable String body) {
            this.body = body;
            return this;
        }

        public Builder setStatusCodes(@Nullable List<String> statusCodes) {
            this.statusCodes = statusCodes;
            return this;
        }

        public ApplicationGatewayProbeHealthResponseMatch build() {
            return new ApplicationGatewayProbeHealthResponseMatch(body, statusCodes);
        }
    }
}
