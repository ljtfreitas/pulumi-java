// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.azurenative.web.outputs.ApplicationLogsConfigResponse;
import io.pulumi.azurenative.web.outputs.EnabledConfigResponse;
import io.pulumi.azurenative.web.outputs.HttpLogsConfigResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetWebAppDiagnosticLogsConfigurationResult {
    /**
     * Application logs configuration.
     * 
     */
    private final @Nullable ApplicationLogsConfigResponse applicationLogs;
    /**
     * Detailed error messages configuration.
     * 
     */
    private final @Nullable EnabledConfigResponse detailedErrorMessages;
    /**
     * Failed requests tracing configuration.
     * 
     */
    private final @Nullable EnabledConfigResponse failedRequestsTracing;
    /**
     * HTTP logs configuration.
     * 
     */
    private final @Nullable HttpLogsConfigResponse httpLogs;
    /**
     * Resource Id.
     * 
     */
    private final String id;
    /**
     * Kind of resource.
     * 
     */
    private final @Nullable String kind;
    /**
     * Resource Name.
     * 
     */
    private final String name;
    /**
     * Resource type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"applicationLogs","detailedErrorMessages","failedRequestsTracing","httpLogs","id","kind","name","type"})
    private GetWebAppDiagnosticLogsConfigurationResult(
        @Nullable ApplicationLogsConfigResponse applicationLogs,
        @Nullable EnabledConfigResponse detailedErrorMessages,
        @Nullable EnabledConfigResponse failedRequestsTracing,
        @Nullable HttpLogsConfigResponse httpLogs,
        String id,
        @Nullable String kind,
        String name,
        String type) {
        this.applicationLogs = applicationLogs;
        this.detailedErrorMessages = detailedErrorMessages;
        this.failedRequestsTracing = failedRequestsTracing;
        this.httpLogs = httpLogs;
        this.id = Objects.requireNonNull(id);
        this.kind = kind;
        this.name = Objects.requireNonNull(name);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Application logs configuration.
     * 
     */
    public Optional<ApplicationLogsConfigResponse> getApplicationLogs() {
        return Optional.ofNullable(this.applicationLogs);
    }
    /**
     * Detailed error messages configuration.
     * 
     */
    public Optional<EnabledConfigResponse> getDetailedErrorMessages() {
        return Optional.ofNullable(this.detailedErrorMessages);
    }
    /**
     * Failed requests tracing configuration.
     * 
     */
    public Optional<EnabledConfigResponse> getFailedRequestsTracing() {
        return Optional.ofNullable(this.failedRequestsTracing);
    }
    /**
     * HTTP logs configuration.
     * 
     */
    public Optional<HttpLogsConfigResponse> getHttpLogs() {
        return Optional.ofNullable(this.httpLogs);
    }
    /**
     * Resource Id.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * Kind of resource.
     * 
     */
    public Optional<String> getKind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * Resource Name.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Resource type.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWebAppDiagnosticLogsConfigurationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ApplicationLogsConfigResponse applicationLogs;
        private @Nullable EnabledConfigResponse detailedErrorMessages;
        private @Nullable EnabledConfigResponse failedRequestsTracing;
        private @Nullable HttpLogsConfigResponse httpLogs;
        private String id;
        private @Nullable String kind;
        private String name;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWebAppDiagnosticLogsConfigurationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationLogs = defaults.applicationLogs;
    	      this.detailedErrorMessages = defaults.detailedErrorMessages;
    	      this.failedRequestsTracing = defaults.failedRequestsTracing;
    	      this.httpLogs = defaults.httpLogs;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder setApplicationLogs(@Nullable ApplicationLogsConfigResponse applicationLogs) {
            this.applicationLogs = applicationLogs;
            return this;
        }

        public Builder setDetailedErrorMessages(@Nullable EnabledConfigResponse detailedErrorMessages) {
            this.detailedErrorMessages = detailedErrorMessages;
            return this;
        }

        public Builder setFailedRequestsTracing(@Nullable EnabledConfigResponse failedRequestsTracing) {
            this.failedRequestsTracing = failedRequestsTracing;
            return this;
        }

        public Builder setHttpLogs(@Nullable HttpLogsConfigResponse httpLogs) {
            this.httpLogs = httpLogs;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetWebAppDiagnosticLogsConfigurationResult build() {
            return new GetWebAppDiagnosticLogsConfigurationResult(applicationLogs, detailedErrorMessages, failedRequestsTracing, httpLogs, id, kind, name, type);
        }
    }
}
