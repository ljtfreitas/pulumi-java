// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The location of http server.
 * 
 */
public final class HttpServerLocationArgs extends io.pulumi.resources.ResourceArgs {

    public static final HttpServerLocationArgs Empty = new HttpServerLocationArgs();

    /**
     * Specify the file name of dataset. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="fileName")
        private final @Nullable Input<Object> fileName;

    public Input<Object> getFileName() {
        return this.fileName == null ? Input.empty() : this.fileName;
    }

    /**
     * Specify the folder path of dataset. Type: string (or Expression with resultType string)
     * 
     */
    @InputImport(name="folderPath")
        private final @Nullable Input<Object> folderPath;

    public Input<Object> getFolderPath() {
        return this.folderPath == null ? Input.empty() : this.folderPath;
    }

    /**
     * Specify the relativeUrl of http server. Type: string (or Expression with resultType string)
     * 
     */
    @InputImport(name="relativeUrl")
        private final @Nullable Input<Object> relativeUrl;

    public Input<Object> getRelativeUrl() {
        return this.relativeUrl == null ? Input.empty() : this.relativeUrl;
    }

    /**
     * Type of dataset storage location.
     * Expected value is 'HttpServerLocation'.
     * 
     */
    @InputImport(name="type", required=true)
        private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public HttpServerLocationArgs(
        @Nullable Input<Object> fileName,
        @Nullable Input<Object> folderPath,
        @Nullable Input<Object> relativeUrl,
        Input<String> type) {
        this.fileName = fileName;
        this.folderPath = folderPath;
        this.relativeUrl = relativeUrl;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private HttpServerLocationArgs() {
        this.fileName = Input.empty();
        this.folderPath = Input.empty();
        this.relativeUrl = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpServerLocationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Object> fileName;
        private @Nullable Input<Object> folderPath;
        private @Nullable Input<Object> relativeUrl;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpServerLocationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fileName = defaults.fileName;
    	      this.folderPath = defaults.folderPath;
    	      this.relativeUrl = defaults.relativeUrl;
    	      this.type = defaults.type;
        }

        public Builder setFileName(@Nullable Input<Object> fileName) {
            this.fileName = fileName;
            return this;
        }

        public Builder setFileName(@Nullable Object fileName) {
            this.fileName = Input.ofNullable(fileName);
            return this;
        }

        public Builder setFolderPath(@Nullable Input<Object> folderPath) {
            this.folderPath = folderPath;
            return this;
        }

        public Builder setFolderPath(@Nullable Object folderPath) {
            this.folderPath = Input.ofNullable(folderPath);
            return this;
        }

        public Builder setRelativeUrl(@Nullable Input<Object> relativeUrl) {
            this.relativeUrl = relativeUrl;
            return this;
        }

        public Builder setRelativeUrl(@Nullable Object relativeUrl) {
            this.relativeUrl = Input.ofNullable(relativeUrl);
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }
        public HttpServerLocationArgs build() {
            return new HttpServerLocationArgs(fileName, folderPath, relativeUrl, type);
        }
    }
}
