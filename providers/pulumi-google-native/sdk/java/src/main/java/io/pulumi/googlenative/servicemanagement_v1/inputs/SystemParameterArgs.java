// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Define a parameter's name and location. The parameter may be passed as either an HTTP header or a URL query parameter, and if both are passed the behavior is implementation-dependent.
 * 
 */
public final class SystemParameterArgs extends io.pulumi.resources.ResourceArgs {

    public static final SystemParameterArgs Empty = new SystemParameterArgs();

    /**
     * Define the HTTP header name to use for the parameter. It is case insensitive.
     * 
     */
    @Import(name="httpHeader")
      private final @Nullable Output<String> httpHeader;

    public Output<String> getHttpHeader() {
        return this.httpHeader == null ? Output.empty() : this.httpHeader;
    }

    /**
     * Define the name of the parameter, such as "api_key" . It is case sensitive.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Define the URL query parameter name to use for the parameter. It is case sensitive.
     * 
     */
    @Import(name="urlQueryParameter")
      private final @Nullable Output<String> urlQueryParameter;

    public Output<String> getUrlQueryParameter() {
        return this.urlQueryParameter == null ? Output.empty() : this.urlQueryParameter;
    }

    public SystemParameterArgs(
        @Nullable Output<String> httpHeader,
        @Nullable Output<String> name,
        @Nullable Output<String> urlQueryParameter) {
        this.httpHeader = httpHeader;
        this.name = name;
        this.urlQueryParameter = urlQueryParameter;
    }

    private SystemParameterArgs() {
        this.httpHeader = Output.empty();
        this.name = Output.empty();
        this.urlQueryParameter = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SystemParameterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> httpHeader;
        private @Nullable Output<String> name;
        private @Nullable Output<String> urlQueryParameter;

        public Builder() {
    	      // Empty
        }

        public Builder(SystemParameterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.httpHeader = defaults.httpHeader;
    	      this.name = defaults.name;
    	      this.urlQueryParameter = defaults.urlQueryParameter;
        }

        public Builder httpHeader(@Nullable Output<String> httpHeader) {
            this.httpHeader = httpHeader;
            return this;
        }

        public Builder httpHeader(@Nullable String httpHeader) {
            this.httpHeader = Output.ofNullable(httpHeader);
            return this;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder urlQueryParameter(@Nullable Output<String> urlQueryParameter) {
            this.urlQueryParameter = urlQueryParameter;
            return this;
        }

        public Builder urlQueryParameter(@Nullable String urlQueryParameter) {
            this.urlQueryParameter = Output.ofNullable(urlQueryParameter);
            return this;
        }
        public SystemParameterArgs build() {
            return new SystemParameterArgs(httpHeader, name, urlQueryParameter);
        }
    }
}
