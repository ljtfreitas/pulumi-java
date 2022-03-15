// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.dialogflow_v2.outputs.GoogleCloudDialogflowV2DocumentReloadStatusResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetDocumentResult {
    /**
     * The URI where the file content is located. For documents stored in Google Cloud Storage, these URIs must have the form `gs:///`. NOTE: External URLs must correspond to public webpages, i.e., they must be indexed by Google Search. In particular, URLs for showing documents in Google Cloud Storage (i.e. the URL in your browser) are not supported. Instead use the `gs://` format URI described above.
     * 
     */
    private final String contentUri;
    /**
     * The display name of the document. The name must be 1024 bytes or less; otherwise, the creation request fails.
     * 
     */
    private final String displayName;
    /**
     * Optional. If true, we try to automatically reload the document every day (at a time picked by the system). If false or unspecified, we don't try to automatically reload the document. Currently you can only enable automatic reload for documents sourced from a public url, see `source` field for the source types. Reload status can be tracked in `latest_reload_status`. If a reload fails, we will keep the document unchanged. If a reload fails with internal errors, the system will try to reload the document on the next day. If a reload fails with non-retriable errors (e.g. PERMISION_DENIED), the system will not try to reload the document anymore. You need to manually reload the document successfully by calling `ReloadDocument` and clear the errors.
     * 
     */
    private final Boolean enableAutoReload;
    /**
     * The knowledge type of document content.
     * 
     */
    private final List<String> knowledgeTypes;
    /**
     * The time and status of the latest reload. This reload may have been triggered automatically or manually and may not have succeeded.
     * 
     */
    private final GoogleCloudDialogflowV2DocumentReloadStatusResponse latestReloadStatus;
    /**
     * Optional. Metadata for the document. The metadata supports arbitrary key-value pairs. Suggested use cases include storing a document's title, an external URL distinct from the document's content_uri, etc. The max size of a `key` or a `value` of the metadata is 1024 bytes.
     * 
     */
    private final Map<String,String> metadata;
    /**
     * The MIME type of this document.
     * 
     */
    private final String mimeType;
    /**
     * Optional. The document resource name. The name must be empty when creating a document. Format: `projects//locations//knowledgeBases//documents/`.
     * 
     */
    private final String name;
    /**
     * The raw content of the document. This field is only permitted for EXTRACTIVE_QA and FAQ knowledge types.
     * 
     */
    private final String rawContent;

    @CustomType.Constructor
    private GetDocumentResult(
        @CustomType.Parameter("contentUri") String contentUri,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("enableAutoReload") Boolean enableAutoReload,
        @CustomType.Parameter("knowledgeTypes") List<String> knowledgeTypes,
        @CustomType.Parameter("latestReloadStatus") GoogleCloudDialogflowV2DocumentReloadStatusResponse latestReloadStatus,
        @CustomType.Parameter("metadata") Map<String,String> metadata,
        @CustomType.Parameter("mimeType") String mimeType,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("rawContent") String rawContent) {
        this.contentUri = contentUri;
        this.displayName = displayName;
        this.enableAutoReload = enableAutoReload;
        this.knowledgeTypes = knowledgeTypes;
        this.latestReloadStatus = latestReloadStatus;
        this.metadata = metadata;
        this.mimeType = mimeType;
        this.name = name;
        this.rawContent = rawContent;
    }

    /**
     * The URI where the file content is located. For documents stored in Google Cloud Storage, these URIs must have the form `gs:///`. NOTE: External URLs must correspond to public webpages, i.e., they must be indexed by Google Search. In particular, URLs for showing documents in Google Cloud Storage (i.e. the URL in your browser) are not supported. Instead use the `gs://` format URI described above.
     * 
    */
    public String getContentUri() {
        return this.contentUri;
    }
    /**
     * The display name of the document. The name must be 1024 bytes or less; otherwise, the creation request fails.
     * 
    */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Optional. If true, we try to automatically reload the document every day (at a time picked by the system). If false or unspecified, we don't try to automatically reload the document. Currently you can only enable automatic reload for documents sourced from a public url, see `source` field for the source types. Reload status can be tracked in `latest_reload_status`. If a reload fails, we will keep the document unchanged. If a reload fails with internal errors, the system will try to reload the document on the next day. If a reload fails with non-retriable errors (e.g. PERMISION_DENIED), the system will not try to reload the document anymore. You need to manually reload the document successfully by calling `ReloadDocument` and clear the errors.
     * 
    */
    public Boolean getEnableAutoReload() {
        return this.enableAutoReload;
    }
    /**
     * The knowledge type of document content.
     * 
    */
    public List<String> getKnowledgeTypes() {
        return this.knowledgeTypes;
    }
    /**
     * The time and status of the latest reload. This reload may have been triggered automatically or manually and may not have succeeded.
     * 
    */
    public GoogleCloudDialogflowV2DocumentReloadStatusResponse getLatestReloadStatus() {
        return this.latestReloadStatus;
    }
    /**
     * Optional. Metadata for the document. The metadata supports arbitrary key-value pairs. Suggested use cases include storing a document's title, an external URL distinct from the document's content_uri, etc. The max size of a `key` or a `value` of the metadata is 1024 bytes.
     * 
    */
    public Map<String,String> getMetadata() {
        return this.metadata;
    }
    /**
     * The MIME type of this document.
     * 
    */
    public String getMimeType() {
        return this.mimeType;
    }
    /**
     * Optional. The document resource name. The name must be empty when creating a document. Format: `projects//locations//knowledgeBases//documents/`.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The raw content of the document. This field is only permitted for EXTRACTIVE_QA and FAQ knowledge types.
     * 
    */
    public String getRawContent() {
        return this.rawContent;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDocumentResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String contentUri;
        private String displayName;
        private Boolean enableAutoReload;
        private List<String> knowledgeTypes;
        private GoogleCloudDialogflowV2DocumentReloadStatusResponse latestReloadStatus;
        private Map<String,String> metadata;
        private String mimeType;
        private String name;
        private String rawContent;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDocumentResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentUri = defaults.contentUri;
    	      this.displayName = defaults.displayName;
    	      this.enableAutoReload = defaults.enableAutoReload;
    	      this.knowledgeTypes = defaults.knowledgeTypes;
    	      this.latestReloadStatus = defaults.latestReloadStatus;
    	      this.metadata = defaults.metadata;
    	      this.mimeType = defaults.mimeType;
    	      this.name = defaults.name;
    	      this.rawContent = defaults.rawContent;
        }

        public Builder contentUri(String contentUri) {
            this.contentUri = Objects.requireNonNull(contentUri);
            return this;
        }

        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder enableAutoReload(Boolean enableAutoReload) {
            this.enableAutoReload = Objects.requireNonNull(enableAutoReload);
            return this;
        }

        public Builder knowledgeTypes(List<String> knowledgeTypes) {
            this.knowledgeTypes = Objects.requireNonNull(knowledgeTypes);
            return this;
        }

        public Builder latestReloadStatus(GoogleCloudDialogflowV2DocumentReloadStatusResponse latestReloadStatus) {
            this.latestReloadStatus = Objects.requireNonNull(latestReloadStatus);
            return this;
        }

        public Builder metadata(Map<String,String> metadata) {
            this.metadata = Objects.requireNonNull(metadata);
            return this;
        }

        public Builder mimeType(String mimeType) {
            this.mimeType = Objects.requireNonNull(mimeType);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder rawContent(String rawContent) {
            this.rawContent = Objects.requireNonNull(rawContent);
            return this;
        }
        public GetDocumentResult build() {
            return new GetDocumentResult(contentUri, displayName, enableAutoReload, knowledgeTypes, latestReloadStatus, metadata, mimeType, name, rawContent);
        }
    }
}
