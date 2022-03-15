// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.deploymentmanager_v2beta.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ImportFileResponse extends io.pulumi.resources.InvokeArgs {

    public static final ImportFileResponse Empty = new ImportFileResponse();

    /**
     * The contents of the file.
     * 
     */
    @Import(name="content", required=true)
      private final String content;

    public String getContent() {
        return this.content;
    }

    /**
     * The name of the file.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    public ImportFileResponse(
        String content,
        String name) {
        this.content = Objects.requireNonNull(content, "expected parameter 'content' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private ImportFileResponse() {
        this.content = null;
        this.name = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImportFileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String content;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(ImportFileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.content = defaults.content;
    	      this.name = defaults.name;
        }

        public Builder content(String content) {
            this.content = Objects.requireNonNull(content);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public ImportFileResponse build() {
            return new ImportFileResponse(content, name);
        }
    }
}
