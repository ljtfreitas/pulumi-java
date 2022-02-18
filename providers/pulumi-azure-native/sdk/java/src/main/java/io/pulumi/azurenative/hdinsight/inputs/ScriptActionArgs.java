// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hdinsight.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Describes a script action on role on the cluster.
 * 
 */
public final class ScriptActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ScriptActionArgs Empty = new ScriptActionArgs();

    /**
     * The name of the script action.
     * 
     */
    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * The parameters for the script provided.
     * 
     */
    @InputImport(name="parameters", required=true)
    private final Input<String> parameters;

    public Input<String> getParameters() {
        return this.parameters;
    }

    /**
     * The URI to the script.
     * 
     */
    @InputImport(name="uri", required=true)
    private final Input<String> uri;

    public Input<String> getUri() {
        return this.uri;
    }

    public ScriptActionArgs(
        Input<String> name,
        Input<String> parameters,
        Input<String> uri) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.parameters = Objects.requireNonNull(parameters, "expected parameter 'parameters' to be non-null");
        this.uri = Objects.requireNonNull(uri, "expected parameter 'uri' to be non-null");
    }

    private ScriptActionArgs() {
        this.name = Input.empty();
        this.parameters = Input.empty();
        this.uri = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScriptActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> name;
        private Input<String> parameters;
        private Input<String> uri;

        public Builder() {
    	      // Empty
        }

        public Builder(ScriptActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
    	      this.uri = defaults.uri;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setParameters(Input<String> parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }

        public Builder setParameters(String parameters) {
            this.parameters = Input.of(Objects.requireNonNull(parameters));
            return this;
        }

        public Builder setUri(Input<String> uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }

        public Builder setUri(String uri) {
            this.uri = Input.of(Objects.requireNonNull(uri));
            return this;
        }

        public ScriptActionArgs build() {
            return new ScriptActionArgs(name, parameters, uri);
        }
    }
}
