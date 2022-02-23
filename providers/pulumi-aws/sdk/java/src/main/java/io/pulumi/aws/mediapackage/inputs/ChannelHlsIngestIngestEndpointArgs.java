// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.mediapackage.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ChannelHlsIngestIngestEndpointArgs extends io.pulumi.resources.ResourceArgs {

    public static final ChannelHlsIngestIngestEndpointArgs Empty = new ChannelHlsIngestIngestEndpointArgs();

    /**
     * The password
     * 
     */
    @InputImport(name="password")
    private final @Nullable Input<String> password;

    public Input<String> getPassword() {
        return this.password == null ? Input.empty() : this.password;
    }

    /**
     * The URL
     * 
     */
    @InputImport(name="url")
    private final @Nullable Input<String> url;

    public Input<String> getUrl() {
        return this.url == null ? Input.empty() : this.url;
    }

    /**
     * The username
     * 
     */
    @InputImport(name="username")
    private final @Nullable Input<String> username;

    public Input<String> getUsername() {
        return this.username == null ? Input.empty() : this.username;
    }

    public ChannelHlsIngestIngestEndpointArgs(
        @Nullable Input<String> password,
        @Nullable Input<String> url,
        @Nullable Input<String> username) {
        this.password = password;
        this.url = url;
        this.username = username;
    }

    private ChannelHlsIngestIngestEndpointArgs() {
        this.password = Input.empty();
        this.url = Input.empty();
        this.username = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ChannelHlsIngestIngestEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> password;
        private @Nullable Input<String> url;
        private @Nullable Input<String> username;

        public Builder() {
    	      // Empty
        }

        public Builder(ChannelHlsIngestIngestEndpointArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.password = defaults.password;
    	      this.url = defaults.url;
    	      this.username = defaults.username;
        }

        public Builder setPassword(@Nullable Input<String> password) {
            this.password = password;
            return this;
        }

        public Builder setPassword(@Nullable String password) {
            this.password = Input.ofNullable(password);
            return this;
        }

        public Builder setUrl(@Nullable Input<String> url) {
            this.url = url;
            return this;
        }

        public Builder setUrl(@Nullable String url) {
            this.url = Input.ofNullable(url);
            return this;
        }

        public Builder setUsername(@Nullable Input<String> username) {
            this.username = username;
            return this;
        }

        public Builder setUsername(@Nullable String username) {
            this.username = Input.ofNullable(username);
            return this;
        }
        public ChannelHlsIngestIngestEndpointArgs build() {
            return new ChannelHlsIngestIngestEndpointArgs(password, url, username);
        }
    }
}
