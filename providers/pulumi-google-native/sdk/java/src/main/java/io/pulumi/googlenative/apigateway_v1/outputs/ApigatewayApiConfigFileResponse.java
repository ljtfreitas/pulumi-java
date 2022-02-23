// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigateway_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ApigatewayApiConfigFileResponse {
    /**
     * The bytes that constitute the file.
     * 
     */
    private final String contents;
    /**
     * The file path (full or relative path). This is typically the path of the file when it is uploaded.
     * 
     */
    private final String path;

    @OutputCustomType.Constructor({"contents","path"})
    private ApigatewayApiConfigFileResponse(
        String contents,
        String path) {
        this.contents = Objects.requireNonNull(contents);
        this.path = Objects.requireNonNull(path);
    }

    /**
     * The bytes that constitute the file.
     * 
     */
    public String getContents() {
        return this.contents;
    }
    /**
     * The file path (full or relative path). This is typically the path of the file when it is uploaded.
     * 
     */
    public String getPath() {
        return this.path;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApigatewayApiConfigFileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String contents;
        private String path;

        public Builder() {
    	      // Empty
        }

        public Builder(ApigatewayApiConfigFileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contents = defaults.contents;
    	      this.path = defaults.path;
        }

        public Builder setContents(String contents) {
            this.contents = Objects.requireNonNull(contents);
            return this;
        }

        public Builder setPath(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }
        public ApigatewayApiConfigFileResponse build() {
            return new ApigatewayApiConfigFileResponse(contents, path);
        }
    }
}
