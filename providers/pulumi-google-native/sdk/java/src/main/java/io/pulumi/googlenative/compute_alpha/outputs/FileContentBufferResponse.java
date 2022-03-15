// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class FileContentBufferResponse {
    /**
     * The raw content in the secure keys file.
     * 
     */
    private final String content;
    /**
     * The file type of source file.
     * 
     */
    private final String fileType;

    @CustomType.Constructor
    private FileContentBufferResponse(
        @CustomType.Parameter("content") String content,
        @CustomType.Parameter("fileType") String fileType) {
        this.content = content;
        this.fileType = fileType;
    }

    /**
     * The raw content in the secure keys file.
     * 
    */
    public String getContent() {
        return this.content;
    }
    /**
     * The file type of source file.
     * 
    */
    public String getFileType() {
        return this.fileType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FileContentBufferResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String content;
        private String fileType;

        public Builder() {
    	      // Empty
        }

        public Builder(FileContentBufferResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.content = defaults.content;
    	      this.fileType = defaults.fileType;
        }

        public Builder content(String content) {
            this.content = Objects.requireNonNull(content);
            return this;
        }

        public Builder fileType(String fileType) {
            this.fileType = Objects.requireNonNull(fileType);
            return this;
        }
        public FileContentBufferResponse build() {
            return new FileContentBufferResponse(content, fileType);
        }
    }
}
