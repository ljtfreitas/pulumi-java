// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
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

    @OutputCustomType.Constructor({"content","fileType"})
    private FileContentBufferResponse(
        String content,
        String fileType) {
        this.content = Objects.requireNonNull(content);
        this.fileType = Objects.requireNonNull(fileType);
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

        public Builder setContent(String content) {
            this.content = Objects.requireNonNull(content);
            return this;
        }

        public Builder setFileType(String fileType) {
            this.fileType = Objects.requireNonNull(fileType);
            return this;
        }
        public FileContentBufferResponse build() {
            return new FileContentBufferResponse(content, fileType);
        }
    }
}
