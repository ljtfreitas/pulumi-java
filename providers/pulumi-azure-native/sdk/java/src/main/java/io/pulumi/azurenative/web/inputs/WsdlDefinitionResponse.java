// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.azurenative.web.inputs.WsdlServiceResponse;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The WSDL definition
 * 
 */
public final class WsdlDefinitionResponse extends io.pulumi.resources.InvokeArgs {

    public static final WsdlDefinitionResponse Empty = new WsdlDefinitionResponse();

    /**
     * The WSDL content
     * 
     */
    @Import(name="content")
      private final @Nullable String content;

    public Optional<String> getContent() {
        return this.content == null ? Optional.empty() : Optional.ofNullable(this.content);
    }

    /**
     * The WSDL import method
     * 
     */
    @Import(name="importMethod")
      private final @Nullable String importMethod;

    public Optional<String> getImportMethod() {
        return this.importMethod == null ? Optional.empty() : Optional.ofNullable(this.importMethod);
    }

    /**
     * The service with name and endpoint names
     * 
     */
    @Import(name="service")
      private final @Nullable WsdlServiceResponse service;

    public Optional<WsdlServiceResponse> getService() {
        return this.service == null ? Optional.empty() : Optional.ofNullable(this.service);
    }

    /**
     * The WSDL URL
     * 
     */
    @Import(name="url")
      private final @Nullable String url;

    public Optional<String> getUrl() {
        return this.url == null ? Optional.empty() : Optional.ofNullable(this.url);
    }

    public WsdlDefinitionResponse(
        @Nullable String content,
        @Nullable String importMethod,
        @Nullable WsdlServiceResponse service,
        @Nullable String url) {
        this.content = content;
        this.importMethod = importMethod;
        this.service = service;
        this.url = url;
    }

    private WsdlDefinitionResponse() {
        this.content = null;
        this.importMethod = null;
        this.service = null;
        this.url = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WsdlDefinitionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String content;
        private @Nullable String importMethod;
        private @Nullable WsdlServiceResponse service;
        private @Nullable String url;

        public Builder() {
    	      // Empty
        }

        public Builder(WsdlDefinitionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.content = defaults.content;
    	      this.importMethod = defaults.importMethod;
    	      this.service = defaults.service;
    	      this.url = defaults.url;
        }

        public Builder content(@Nullable String content) {
            this.content = content;
            return this;
        }

        public Builder importMethod(@Nullable String importMethod) {
            this.importMethod = importMethod;
            return this;
        }

        public Builder service(@Nullable WsdlServiceResponse service) {
            this.service = service;
            return this;
        }

        public Builder url(@Nullable String url) {
            this.url = url;
            return this;
        }
        public WsdlDefinitionResponse build() {
            return new WsdlDefinitionResponse(content, importMethod, service, url);
        }
    }
}
