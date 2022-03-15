// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The entrypoint for the application.
 * 
 */
public final class EntrypointResponse extends io.pulumi.resources.InvokeArgs {

    public static final EntrypointResponse Empty = new EntrypointResponse();

    /**
     * The format should be a shell command that can be fed to bash -c.
     * 
     */
    @Import(name="shell", required=true)
      private final String shell;

    public String getShell() {
        return this.shell;
    }

    public EntrypointResponse(String shell) {
        this.shell = Objects.requireNonNull(shell, "expected parameter 'shell' to be non-null");
    }

    private EntrypointResponse() {
        this.shell = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EntrypointResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String shell;

        public Builder() {
    	      // Empty
        }

        public Builder(EntrypointResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.shell = defaults.shell;
        }

        public Builder shell(String shell) {
            this.shell = Objects.requireNonNull(shell);
            return this;
        }
        public EntrypointResponse build() {
            return new EntrypointResponse(shell);
        }
    }
}
