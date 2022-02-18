// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabricmesh.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Diagnostics settings for Geneva.
 * 
 */
public final class AzureInternalMonitoringPipelineSinkDescriptionArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureInternalMonitoringPipelineSinkDescriptionArgs Empty = new AzureInternalMonitoringPipelineSinkDescriptionArgs();

    /**
     * Azure Internal monitoring pipeline account.
     * 
     */
    @InputImport(name="accountName")
    private final @Nullable Input<String> accountName;

    public Input<String> getAccountName() {
        return this.accountName == null ? Input.empty() : this.accountName;
    }

    /**
     * Azure Internal monitoring pipeline autokey associated with the certificate.
     * 
     */
    @InputImport(name="autoKeyConfigUrl")
    private final @Nullable Input<String> autoKeyConfigUrl;

    public Input<String> getAutoKeyConfigUrl() {
        return this.autoKeyConfigUrl == null ? Input.empty() : this.autoKeyConfigUrl;
    }

    /**
     * A description of the sink.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Azure Internal monitoring agent fluentd configuration.
     * 
     */
    @InputImport(name="fluentdConfigUrl")
    private final @Nullable Input<Object> fluentdConfigUrl;

    public Input<Object> getFluentdConfigUrl() {
        return this.fluentdConfigUrl == null ? Input.empty() : this.fluentdConfigUrl;
    }

    /**
     * The kind of DiagnosticsSink.
     * Expected value is 'AzureInternalMonitoringPipeline'.
     * 
     */
    @InputImport(name="kind", required=true)
    private final Input<String> kind;

    public Input<String> getKind() {
        return this.kind;
    }

    /**
     * Azure Internal monitoring agent configuration.
     * 
     */
    @InputImport(name="maConfigUrl")
    private final @Nullable Input<String> maConfigUrl;

    public Input<String> getMaConfigUrl() {
        return this.maConfigUrl == null ? Input.empty() : this.maConfigUrl;
    }

    /**
     * Name of the sink. This value is referenced by DiagnosticsReferenceDescription
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Azure Internal monitoring pipeline account namespace.
     * 
     */
    @InputImport(name="namespace")
    private final @Nullable Input<String> namespace;

    public Input<String> getNamespace() {
        return this.namespace == null ? Input.empty() : this.namespace;
    }

    public AzureInternalMonitoringPipelineSinkDescriptionArgs(
        @Nullable Input<String> accountName,
        @Nullable Input<String> autoKeyConfigUrl,
        @Nullable Input<String> description,
        @Nullable Input<Object> fluentdConfigUrl,
        Input<String> kind,
        @Nullable Input<String> maConfigUrl,
        @Nullable Input<String> name,
        @Nullable Input<String> namespace) {
        this.accountName = accountName;
        this.autoKeyConfigUrl = autoKeyConfigUrl;
        this.description = description;
        this.fluentdConfigUrl = fluentdConfigUrl;
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.maConfigUrl = maConfigUrl;
        this.name = name;
        this.namespace = namespace;
    }

    private AzureInternalMonitoringPipelineSinkDescriptionArgs() {
        this.accountName = Input.empty();
        this.autoKeyConfigUrl = Input.empty();
        this.description = Input.empty();
        this.fluentdConfigUrl = Input.empty();
        this.kind = Input.empty();
        this.maConfigUrl = Input.empty();
        this.name = Input.empty();
        this.namespace = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureInternalMonitoringPipelineSinkDescriptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> accountName;
        private @Nullable Input<String> autoKeyConfigUrl;
        private @Nullable Input<String> description;
        private @Nullable Input<Object> fluentdConfigUrl;
        private Input<String> kind;
        private @Nullable Input<String> maConfigUrl;
        private @Nullable Input<String> name;
        private @Nullable Input<String> namespace;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureInternalMonitoringPipelineSinkDescriptionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.autoKeyConfigUrl = defaults.autoKeyConfigUrl;
    	      this.description = defaults.description;
    	      this.fluentdConfigUrl = defaults.fluentdConfigUrl;
    	      this.kind = defaults.kind;
    	      this.maConfigUrl = defaults.maConfigUrl;
    	      this.name = defaults.name;
    	      this.namespace = defaults.namespace;
        }

        public Builder setAccountName(@Nullable Input<String> accountName) {
            this.accountName = accountName;
            return this;
        }

        public Builder setAccountName(@Nullable String accountName) {
            this.accountName = Input.ofNullable(accountName);
            return this;
        }

        public Builder setAutoKeyConfigUrl(@Nullable Input<String> autoKeyConfigUrl) {
            this.autoKeyConfigUrl = autoKeyConfigUrl;
            return this;
        }

        public Builder setAutoKeyConfigUrl(@Nullable String autoKeyConfigUrl) {
            this.autoKeyConfigUrl = Input.ofNullable(autoKeyConfigUrl);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setFluentdConfigUrl(@Nullable Input<Object> fluentdConfigUrl) {
            this.fluentdConfigUrl = fluentdConfigUrl;
            return this;
        }

        public Builder setFluentdConfigUrl(@Nullable Object fluentdConfigUrl) {
            this.fluentdConfigUrl = Input.ofNullable(fluentdConfigUrl);
            return this;
        }

        public Builder setKind(Input<String> kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Input.of(Objects.requireNonNull(kind));
            return this;
        }

        public Builder setMaConfigUrl(@Nullable Input<String> maConfigUrl) {
            this.maConfigUrl = maConfigUrl;
            return this;
        }

        public Builder setMaConfigUrl(@Nullable String maConfigUrl) {
            this.maConfigUrl = Input.ofNullable(maConfigUrl);
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

        public Builder setNamespace(@Nullable Input<String> namespace) {
            this.namespace = namespace;
            return this;
        }

        public Builder setNamespace(@Nullable String namespace) {
            this.namespace = Input.ofNullable(namespace);
            return this;
        }

        public AzureInternalMonitoringPipelineSinkDescriptionArgs build() {
            return new AzureInternalMonitoringPipelineSinkDescriptionArgs(accountName, autoKeyConfigUrl, description, fluentdConfigUrl, kind, maConfigUrl, name, namespace);
        }
    }
}
