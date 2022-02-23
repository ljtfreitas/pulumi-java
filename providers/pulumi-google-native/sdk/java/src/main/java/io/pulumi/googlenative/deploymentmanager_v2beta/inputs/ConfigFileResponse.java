// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.deploymentmanager_v2beta.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ConfigFileResponse extends io.pulumi.resources.InvokeArgs {

    public static final ConfigFileResponse Empty = new ConfigFileResponse();

    /**
     * The contents of the file.
     * 
     */
    @InputImport(name="content", required=true)
      private final String content;

    public String getContent() {
        return this.content;
    }

    public ConfigFileResponse(String content) {
        this.content = Objects.requireNonNull(content, "expected parameter 'content' to be non-null");
    }

    private ConfigFileResponse() {
        this.content = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigFileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String content;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigFileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.content = defaults.content;
        }

        public Builder setContent(String content) {
            this.content = Objects.requireNonNull(content);
            return this;
        }
        public ConfigFileResponse build() {
            return new ConfigFileResponse(content);
        }
    }
}
