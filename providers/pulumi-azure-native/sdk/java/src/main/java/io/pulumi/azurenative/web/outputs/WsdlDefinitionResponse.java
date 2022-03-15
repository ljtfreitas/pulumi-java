// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.azurenative.web.outputs.WsdlServiceResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WsdlDefinitionResponse {
    /**
     * The WSDL content
     * 
     */
    private final @Nullable String content;
    /**
     * The WSDL import method
     * 
     */
    private final @Nullable String importMethod;
    /**
     * The service with name and endpoint names
     * 
     */
    private final @Nullable WsdlServiceResponse service;
    /**
     * The WSDL URL
     * 
     */
    private final @Nullable String url;

    @CustomType.Constructor
    private WsdlDefinitionResponse(
        @CustomType.Parameter("content") @Nullable String content,
        @CustomType.Parameter("importMethod") @Nullable String importMethod,
        @CustomType.Parameter("service") @Nullable WsdlServiceResponse service,
        @CustomType.Parameter("url") @Nullable String url) {
        this.content = content;
        this.importMethod = importMethod;
        this.service = service;
        this.url = url;
    }

    /**
     * The WSDL content
     * 
    */
    public Optional<String> getContent() {
        return Optional.ofNullable(this.content);
    }
    /**
     * The WSDL import method
     * 
    */
    public Optional<String> getImportMethod() {
        return Optional.ofNullable(this.importMethod);
    }
    /**
     * The service with name and endpoint names
     * 
    */
    public Optional<WsdlServiceResponse> getService() {
        return Optional.ofNullable(this.service);
    }
    /**
     * The WSDL URL
     * 
    */
    public Optional<String> getUrl() {
        return Optional.ofNullable(this.url);
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
