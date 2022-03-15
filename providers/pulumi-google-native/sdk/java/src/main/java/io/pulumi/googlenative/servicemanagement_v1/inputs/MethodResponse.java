// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.servicemanagement_v1.inputs.OptionResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Method represents a method of an API interface.
 * 
 */
public final class MethodResponse extends io.pulumi.resources.InvokeArgs {

    public static final MethodResponse Empty = new MethodResponse();

    /**
     * The simple name of this method.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * Any metadata attached to the method.
     * 
     */
    @Import(name="options", required=true)
      private final List<OptionResponse> options;

    public List<OptionResponse> getOptions() {
        return this.options;
    }

    /**
     * If true, the request is streamed.
     * 
     */
    @Import(name="requestStreaming", required=true)
      private final Boolean requestStreaming;

    public Boolean getRequestStreaming() {
        return this.requestStreaming;
    }

    /**
     * A URL of the input message type.
     * 
     */
    @Import(name="requestTypeUrl", required=true)
      private final String requestTypeUrl;

    public String getRequestTypeUrl() {
        return this.requestTypeUrl;
    }

    /**
     * If true, the response is streamed.
     * 
     */
    @Import(name="responseStreaming", required=true)
      private final Boolean responseStreaming;

    public Boolean getResponseStreaming() {
        return this.responseStreaming;
    }

    /**
     * The URL of the output message type.
     * 
     */
    @Import(name="responseTypeUrl", required=true)
      private final String responseTypeUrl;

    public String getResponseTypeUrl() {
        return this.responseTypeUrl;
    }

    /**
     * The source syntax of this method.
     * 
     */
    @Import(name="syntax", required=true)
      private final String syntax;

    public String getSyntax() {
        return this.syntax;
    }

    public MethodResponse(
        String name,
        List<OptionResponse> options,
        Boolean requestStreaming,
        String requestTypeUrl,
        Boolean responseStreaming,
        String responseTypeUrl,
        String syntax) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.options = Objects.requireNonNull(options, "expected parameter 'options' to be non-null");
        this.requestStreaming = Objects.requireNonNull(requestStreaming, "expected parameter 'requestStreaming' to be non-null");
        this.requestTypeUrl = Objects.requireNonNull(requestTypeUrl, "expected parameter 'requestTypeUrl' to be non-null");
        this.responseStreaming = Objects.requireNonNull(responseStreaming, "expected parameter 'responseStreaming' to be non-null");
        this.responseTypeUrl = Objects.requireNonNull(responseTypeUrl, "expected parameter 'responseTypeUrl' to be non-null");
        this.syntax = Objects.requireNonNull(syntax, "expected parameter 'syntax' to be non-null");
    }

    private MethodResponse() {
        this.name = null;
        this.options = List.of();
        this.requestStreaming = null;
        this.requestTypeUrl = null;
        this.responseStreaming = null;
        this.responseTypeUrl = null;
        this.syntax = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MethodResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private List<OptionResponse> options;
        private Boolean requestStreaming;
        private String requestTypeUrl;
        private Boolean responseStreaming;
        private String responseTypeUrl;
        private String syntax;

        public Builder() {
    	      // Empty
        }

        public Builder(MethodResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.options = defaults.options;
    	      this.requestStreaming = defaults.requestStreaming;
    	      this.requestTypeUrl = defaults.requestTypeUrl;
    	      this.responseStreaming = defaults.responseStreaming;
    	      this.responseTypeUrl = defaults.responseTypeUrl;
    	      this.syntax = defaults.syntax;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder options(List<OptionResponse> options) {
            this.options = Objects.requireNonNull(options);
            return this;
        }

        public Builder requestStreaming(Boolean requestStreaming) {
            this.requestStreaming = Objects.requireNonNull(requestStreaming);
            return this;
        }

        public Builder requestTypeUrl(String requestTypeUrl) {
            this.requestTypeUrl = Objects.requireNonNull(requestTypeUrl);
            return this;
        }

        public Builder responseStreaming(Boolean responseStreaming) {
            this.responseStreaming = Objects.requireNonNull(responseStreaming);
            return this;
        }

        public Builder responseTypeUrl(String responseTypeUrl) {
            this.responseTypeUrl = Objects.requireNonNull(responseTypeUrl);
            return this;
        }

        public Builder syntax(String syntax) {
            this.syntax = Objects.requireNonNull(syntax);
            return this;
        }
        public MethodResponse build() {
            return new MethodResponse(name, options, requestStreaming, requestTypeUrl, responseStreaming, responseTypeUrl, syntax);
        }
    }
}
