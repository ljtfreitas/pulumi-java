// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hdinsight.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ScriptActionResponse extends io.pulumi.resources.InvokeArgs {

    public static final ScriptActionResponse Empty = new ScriptActionResponse();

    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    @InputImport(name="parameters", required=true)
    private final String parameters;

    public String getParameters() {
        return this.parameters;
    }

    @InputImport(name="uri", required=true)
    private final String uri;

    public String getUri() {
        return this.uri;
    }

    public ScriptActionResponse(
        String name,
        String parameters,
        String uri) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.parameters = Objects.requireNonNull(parameters, "expected parameter 'parameters' to be non-null");
        this.uri = Objects.requireNonNull(uri, "expected parameter 'uri' to be non-null");
    }

    private ScriptActionResponse() {
        this.name = null;
        this.parameters = null;
        this.uri = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScriptActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String parameters;
        private String uri;

        public Builder() {
    	      // Empty
        }

        public Builder(ScriptActionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
    	      this.uri = defaults.uri;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setParameters(String parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }

        public Builder setUri(String uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }

        public ScriptActionResponse build() {
            return new ScriptActionResponse(name, parameters, uri);
        }
    }
}